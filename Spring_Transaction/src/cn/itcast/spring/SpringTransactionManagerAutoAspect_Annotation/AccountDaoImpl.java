package cn.itcast.spring.SpringTransactionManagerAutoAspect_Annotation;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{
	
	/**
	 * 收款的方法
	 */
	public void in(String to, Double money) {
		String sqlString = "update account set money=money + ? where name=?";
		this.getJdbcTemplate().update(sqlString, money,to);
	}
	/**
	 * 专款的方法
	 */
	public void out(String from, Double money) {
		String sqlString = "update account set money = money - ? where name=?";
		this.getJdbcTemplate().update(sqlString, money,from);
	}

	
	
			
			
}
