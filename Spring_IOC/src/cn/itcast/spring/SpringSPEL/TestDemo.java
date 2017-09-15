package cn.itcast.spring.SpringSPEL;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	@Test
	public void testDemdo(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("cn/itcast/spring/SpringSPEL/beans.xml");
		
		UserServiceImpl userService = (UserServiceImpl) ac.getBean("userServiceImpl");
		System.out.println(userService.toString());
	}
	
}
