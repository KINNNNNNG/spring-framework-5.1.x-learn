import com.wk.edu.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wk
 * @version 1.0
 * @date 2021/11/22 23:46
 */
public class IocTest {

	/**
	 * Ioc容器创建管理Bean对象，Spring Bean是有生命周期的
	 * 构造器执行、初始化方法执行：{@link AbstractApplicationContext#refresh()}#refresh#finishBeanFactoryInitialization
	 * Bean工厂后置处理器初始化、初始化方法执行：{@link AbstractApplicationContext#refresh()}#invokeBeanFactoryPostProcessors
	 * Bean后置处理器初始化：{@link AbstractApplicationContext#refresh()}#refresh#registerBeanPostProcessors
	 * Bean后置处理器Before、After方法：{@link AbstractApplicationContext#refresh()}#finishBeanFactoryInitialization
	 */
	@Test
	public void testIoc() {
		// ApplicationContext是容器的高级接口，BeanFactory（顶级容器，定义了容器的基础行为）
		// ApplicationContext,Spring应用上下文，官方成为IOC容器（错误认知：容器是map；准确来说，map是ioc容器的一个成员
		// 叫做单例池，singletonObjects,容器是一组组件的过程的集合，包括BeanFactory，单例池，BeanPostProcessor等以及之间的协作）
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyBean myBean = context.getBean(MyBean.class);
		System.out.println("1:" + myBean);
	}
}
