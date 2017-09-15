package cn.itcast.spring.SpringJDBCIOCC3P0;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/itcast/spring/SpringJDBCIOCC3P0/beans.xml")
/**
 * Description ʹ��C3P0���ӳ���������
 * @author ��ɺ�
 * @Date 2017��9��11��
 *
 */
public class CreateTableTest {

	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void createTable(){
		
		String createTable = "create table springTest005(id int primary key ,name varchar(20))";
		
		//ʹ��JDBCģ����������ݿ��д�����
		jdbcTemplate.execute(createTable);		
		
		
	}
}
