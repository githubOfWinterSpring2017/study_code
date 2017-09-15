package cn.itcast.spring.SpringJDBCIOCCRUD;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 实现对用户的信息的增删该查
 * @author 黎飞红
 * @Date Sep 12, 2017
 *
 *在这个类中实现对数据库中表的内容进行增删该查，因此在这个类中需要使用到JdbcTemplate这个类
 *但是为了简化开发Spring为我们提供了一个工具类
 */
public class UserDao extends JdbcDaoSupport{

	public int insert(User user){
		String sql = "insert into springtest001 value(?,?)";
		int account = this.getJdbcTemplate().update(sql, user.getId(),user.getName());
		return account;
	}
	
	public int update(int id){
		String sql = "update springtest001 set name='小名' where id=?";
		int account = this.getJdbcTemplate().update(sql, id);
		return account;
	}
	
	public int delete(int id){
		String sql = "delete from springtest001 where id=?";
		int account = this.getJdbcTemplate().update(sql, id);
		return account;
	}
	
	public String find(int id){
		String sqlString = "select name from springtest001 where id=?";
		String nameString = this.getJdbcTemplate().queryForObject(sqlString, String.class, id);
		return nameString;
	}
	
	public User findUser(int id){
		String sqlString = "select * from springtest001 where id=?";
		User user = this.getJdbcTemplate().queryForObject(sqlString, new myRowMapper(), id);
		return user;
	}
	
	class myRowMapper implements RowMapper<User>{

		/**
		 * rs代表的是一行数据，rowNum代表的是行号，这个方法不需要我们手动进行遍历，他会自动进行遍历
		 */
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			return user;
		}
	}
}
