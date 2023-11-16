import com.hwang.study.domain.Product;
import com.hwang.study.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @ClassName SpringSourceTest
 * @Author huangjiang07
 * @Date 2023/11/14
 */
public class SpringSourceTest {


	@Test
	public void testSpringSource() {
		//入口:以XmlBeanFactory做演示
		//从最基本的解析applicationContext.xml开始
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		//创建对象分析：AbstractBeanFactory.doGetBean()分析
		User user = (User) xmlBeanFactory.getBean("user");
		System.out.println(user);

		//用于测试静态工厂
//		Object p = xmlBeanFactory.getBean("p");
//		System.out.println(p);
	}


	@Test
	public void testParentChildBean() {
		/**
		 * 父子Bean：父Bean是一个可继承的抽象类，
		 * 父Bean： <bean id = "parent" abstract = "true">  <property name="age" value="18" />  </bean>
		 * 子Bean： <bean id = "user" class = "com.hwang.study.domain.User" parent = "parent"> <property name="name" value="hwang" /> </bean>
		 */
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));

		User user = beanFactory.getBean("user", User.class);
		System.out.println("user = " + user); //user = User{name='hwang', age=18}
	}


	@Test
	public void testParentChildContainer() {

		/**
		 * 如何将父容器与子容器关联：将父容器的beanFactory作为参数传入子容器的beanFactory
		 * 父子容器特点：
		 * 1、会将父容器当中的内容整合到子容器当中
		 * 2、如遇相同配置，子容器则会覆盖父容器当中的配置
		 */

		//父容器
		DefaultListableBeanFactory parent = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(parent);
		xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("applicationContext-parent.xml"));

		//子容器
		DefaultListableBeanFactory child = new DefaultListableBeanFactory(parent);
		XmlBeanDefinitionReader xmlBeanDefinitionReader1 = new XmlBeanDefinitionReader(child);
		xmlBeanDefinitionReader1.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));

		//product是父容器当中的配置，此处通过子容器去获取，则可验证
		Product product = child.getBean("product", Product.class);
		User user = child.getBean("user", User.class);
		System.out.println("product = " + product);
		System.out.println("user = " + user);
	}
}
