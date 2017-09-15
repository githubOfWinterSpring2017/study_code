package cn.itcast.spring.BeanProperties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySqlDaoTest {

	@Test
	public void testDemo(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("cn/itcast/spring/BeanProperties/beans2.xml");
		MysqlDao mySalDao = (MysqlDao) ac.getBean("mysqlDao");
		System.out.println(mySalDao.toString());
	}
}
