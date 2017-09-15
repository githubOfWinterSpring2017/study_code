package cn.itcast.spring.BeanCollection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCollectionTest {

	@Test
	public void TestDemo(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("cn/itcast/spring/BeanCollection/beans.xml");
		City city = (City) ac.getBean("city");
		System.out.println(city.toString());
	}
	
}
