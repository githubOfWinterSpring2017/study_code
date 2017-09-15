package cn.itcast.spring.SpringJDBCIOCDBCP;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/itcast/spring/SpringJDBCIOCDBCP/beans.xml")
/**
 * Description ʹ��DBCP���ӳ���������
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
		
		String createTable = "create table springTest004(id int primary key ,name varchar(20))";
		
		//ʹ��JDBCģ����������ݿ��д�����
		jdbcTemplate.execute(createTable);
		
	}
}
