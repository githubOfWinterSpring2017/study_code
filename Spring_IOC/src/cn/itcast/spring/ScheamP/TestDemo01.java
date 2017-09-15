package cn.itcast.spring.ScheamP;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo01 {

	@Test
	public void demo01(){
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("cn/itcast/spring/ScheamP/beans.xml");
		Car car = (Car) ac.getBean("car");
		System.out.println(car);
	}
	
	
}
