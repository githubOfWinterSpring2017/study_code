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
 * Description 使用C3P0连接池连创建表
 * 
 * @author 黎飞红
 * @Date 2017年9月11日
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
		user.setName("小红");

		int account = userDao.insert(user);
		if (1 == account) {
			System.out.println("添加用户成功");
		}
	}
	
	//@Test
	public void updateTable(){
		int account = userDao.update(1);
		if(1 == account){
			System.out.println("修改用户成功");
		}
	}
	
	//@Test
	public void deleteTable(){
		int account = userDao.delete(1);
		if(1 == account){
			System.out.println("删除用户成功");
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
