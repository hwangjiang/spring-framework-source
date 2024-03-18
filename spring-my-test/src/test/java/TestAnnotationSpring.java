import com.hwang.study.domain.AppConfig;
import com.hwang.study.domain.Product;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestAnnotationSpring
 * @Description //TODO
 * @Author huangjiang07
 * @Date 2024/3/16
 */
public class TestAnnotationSpring {


	@Test
	public void test(){
		//分析注解注入
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Product product = (Product) ctx.getBean("product");
		System.out.println("product = " + product);
		System.out.println("product.getAccount() = " + product.getAccount());
	}
}
