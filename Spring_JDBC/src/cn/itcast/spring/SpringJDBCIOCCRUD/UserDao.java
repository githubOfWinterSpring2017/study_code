package cn.itcast.spring.SpringJDBCIOCCRUD;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * ʵ�ֶ��û�����Ϣ����ɾ�ò�
 * @author ��ɺ�
 * @Date Sep 12, 2017
 *
 *���������ʵ�ֶ����ݿ��б�����ݽ�����ɾ�ò飬��������������Ҫʹ�õ�JdbcTemplate�����
 *����Ϊ�˼򻯿���SpringΪ�����ṩ��һ��������
 */
public class UserDao extends JdbcDaoSupport{

	public int insert(User user){
		String sql = "insert into springtest001 value(?,?)";
		int account = this.getJdbcTemplate().update(sql, user.getId(),user.getName());
		return account;
	}
	
	public int update(int id){
		String sql = "update springtest001 set name='С��' where id=?";
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
		 * rs�������һ�����ݣ�rowNum��������кţ������������Ҫ�����ֶ����б����������Զ����б���
		 */
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			return user;
		}
	}
}
