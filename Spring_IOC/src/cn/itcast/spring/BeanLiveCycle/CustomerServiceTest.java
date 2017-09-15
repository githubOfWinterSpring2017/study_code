package cn.itcast.spring.BeanLiveCycle;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerServiceTest {

	@Test
	public void demo01(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("cn/itcast/spring/BeanLiveCycle/beans.xml");
		CustomerService customerService = (CustomerService)applicationContext.getBean("customerService");
		customerService.add();
		customerService.find();
		applicationContext.close();
	}
	
	
}
