package cn.itcast.spring.BeanAnnotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	@Test
	public void demo01(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("cn/itcast/spring/BeanAnnotation/beans.xml");
		UserService userService = (UserService) ac.getBean("userService");
		//userService.sayHello();
		System.out.println(userService);
	}
	
	
}
