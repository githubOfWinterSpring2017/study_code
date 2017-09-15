package cn.itcast.spring.SpringAdvisor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试不带切点的切面
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("beans.xml")
public class UserDaoTest {
	
	@Autowired
	@Qualifier("proxyUserDao")
	private UserDao userDao;
	
	@Test
	public void testDemo(){	
		userDao.add();
		userDao.delete();
		userDao.find();
		userDao.update();			
	}
}
