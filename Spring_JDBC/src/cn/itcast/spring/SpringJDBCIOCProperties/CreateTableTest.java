package cn.itcast.spring.SpringJDBCIOCProperties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/itcast/spring/SpringJDBCIOCProperties/beans.xml")
/**
 * Description 将数据库的连接信息配置到配置文件中
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
		
		String createTable = "create table springTest007(id int primary key ,name varchar(20))";
		
		//使用JDBC模版在这个数据库中创建表
		jdbcTemplate.execute(createTable);		
		
		
	}
}
