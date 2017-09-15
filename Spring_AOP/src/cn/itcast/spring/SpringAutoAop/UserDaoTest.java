package cn.itcast.spring.SpringAutoAop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * �����Զ�����
 * ��ͳ�����ɴ���ķ�ʽ����Ҫ��Ŀ������뵽�����������ɴ������
 * ���Զ��������ǻ��ں���Bean��
 * 
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/itcast/spring/SpringAutoAop/beans.xml")
public class UserDaoTest {
	
	@Autowired
	@Qualifier("userDao")//�����ﲻ����Ҫע��������ˣ���Ϊ���Bean��ʵ�����Ĺ����лᱻ�������ʵ����ȡ��
	private UserDao userDao;
	
	@Test
	public void testDemo(){	
		userDao.add();
		userDao.delete();
		userDao.find();
		userDao.update();			
	}
}
