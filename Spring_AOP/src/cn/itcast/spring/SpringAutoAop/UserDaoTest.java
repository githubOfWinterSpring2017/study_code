package cn.itcast.spring.SpringAutoAop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试自动代理
 * 传统的生成代理的方式：需要将目标对象传入到代理类中生成代理对象
 * 而自动代理则是基于后处理Bean来
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/itcast/spring/SpringAutoAop/beans.xml")
public class UserDaoTest {
	
	@Autowired
	@Qualifier("userDao")//在这里不再需要注入代理类了，因为这个Bean在实例化的过程中会被代理类的实例所取代
	private UserDao userDao;
	
	@Test
	public void testDemo(){	
		userDao.add();
		userDao.delete();
		userDao.find();
		userDao.update();			
	}
}
