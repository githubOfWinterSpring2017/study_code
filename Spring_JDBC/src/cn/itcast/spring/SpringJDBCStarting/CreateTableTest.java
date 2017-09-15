package cn.itcast.spring.SpringJDBCStarting;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CreateTableTest {

	@Test
	public void createTable(){
		
		String createTable = "create table springTest001(id int primary key ,name varchar(20))";
		
		//ʹ��Spring�Դ������ӳ�
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		//�������ӳز���
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///SpringJDBC");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		//ʹ��JDBCģ����������ݿ��д�����
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.execute(createTable);
	}
}
