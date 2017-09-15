package cn.itcast.spring.BeanSimpleIntroduction;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class SpringTest {

	@Test
	public void demo01() {
		HelloService helloService = new HelloServiceImpl();
		helloService.sayHello();
	}

	/**
	 * Java的多态：在Java语言中，多态主要有两种实现形式：一种是继承，另一种是接口，基于接口实现的多态比基于继承实现的多态更加的灵活方便。
	 * （1）基于继承的多态：在Java中基于继承的多态是指对象方法的调用是通过父类的引用来进行的，也就是说通过父类的引用来指向子类的对象，这样调用父类中定义的方法实际是调用子类中重写的方法。
	 * （2）基于接口的多态：在Java中基于接口的多态是指对象方法的调用是通过接口的引用来进行的，也就是说通过接口的引用来指向实现类的对象，这样调用接口中定义的方法实际上就是调用实现类中实现的接口的方法
	 */
	@Test
	public void demo02() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"cn/itcast/spring/BeanSimpleIntroduction/beans.xml");
		
		HelloService helloService = (HelloService) applicationContext.getBean("helloServiceImpl");
		helloService.sayHello();
	}
	
	
	public void demo03(){
		ApplicationContext ac = new FileSystemXmlApplicationContext("WebRoot/beans.xml");
		HelloService helloService = (HelloService) ac.getBean("helloServiceImpl");
		helloService.sayHello();
	}

	public void demo04(){
		//BeanFactory bf = new ClassPathXmlApplicationContext("beans.xml");
		//BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		BeanFactory bf = new FileSystemXmlApplicationContext("WebRoot/beans.xml");
		//BeanFactory bf = new XmlBeanFactory(new FileSystemResource("WebRoot/beans.xml"));
		HelloService helloService = (HelloService) bf.getBean("helloServiceImpl");
		helloService.sayHello();
	}
	
	

}
