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
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		User user = (User) xmlBeanFactory.getBean("user");
		System.out.println(user);
	}
}
