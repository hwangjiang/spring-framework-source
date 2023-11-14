import com.hwang.study.domain.User;
import org.junit.Test;
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
	}
}
