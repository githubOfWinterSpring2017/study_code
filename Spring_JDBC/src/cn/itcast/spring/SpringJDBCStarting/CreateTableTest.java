package cn.itcast.spring.SpringJDBCStarting;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CreateTableTest {

	@Test
	public void createTable(){
		
		String createTable = "create table springTest001(id int primary key ,name varchar(20))";
		
		//使用Spring自带的连接池
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		//设置连接池参数
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///SpringJDBC");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		//使用JDBC模版在这个数据库中创建表
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.execute(createTable);
	}
}
