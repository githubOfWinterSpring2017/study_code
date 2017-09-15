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
 * Description 使用DBCP连接池连创建表
 * @author 黎飞红
 * @Date 2017年9月11日
 *
 */
public class CreateTableTest {

	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void createTable(){
		
		String createTable = "create table springTest004(id int primary key ,name varchar(20))";
		
		//使用JDBC模版在这个数据库中创建表
		jdbcTemplate.execute(createTable);
		
	}
}
