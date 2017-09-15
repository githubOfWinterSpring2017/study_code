package cn.itcast.spring.SpringJDBCIOCCRUD;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/itcast/spring/SpringJDBCIOCCRUD/beans.xml")
/**
 * Description ʹ��C3P0���ӳ���������
 * 
 * @author ��ɺ�
 * @Date 2017��9��11��
 * 
 */
public class CRUDTableTest {

	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;

	//@Test	
	public void insertTable() {

		User user = new User();
		user.setId(1);
		user.setName("С��");

		int account = userDao.insert(user);
		if (1 == account) {
			System.out.println("����û��ɹ�");
		}
	}
	
	//@Test
	public void updateTable(){
		int account = userDao.update(1);
		if(1 == account){
			System.out.println("�޸��û��ɹ�");
		}
	}
	
	//@Test
	public void deleteTable(){
		int account = userDao.delete(1);
		if(1 == account){
			System.out.println("ɾ���û��ɹ�");
		}
	}
	//@Test
	public void queryTableSimple(){
		int id = 1;
		String nameString = userDao.find(id);
		System.out.println(nameString);
	}
	@Test
	public void queryTableComplex(){
		int id = 1;
		User suer = userDao.findUser(id);
		System.out.println(suer);
	}
	
	
}
