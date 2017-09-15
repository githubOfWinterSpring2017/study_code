package cn.itcast.spring.BeanProperties;

public class MysqlDao {

	private String userName;
	private String password;
	private String driverClass;
	private String jdbcUrl;
	private int initPoolSize;
	private int maxPoolSize;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public String getJdbcUrl() {
		return jdbcUrl;
	}
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
	public int getInitPoolSize() {
		return initPoolSize;
	}
	public void setInitPoolSize(int initPoolSize) {
		this.initPoolSize = initPoolSize;
	}
	public int getMaxPoolSize() {
		return maxPoolSize;
	}
	public void setMaxPoolSize(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
	}
	
	@Override
	public String toString() {
		return "MysqlDao [userName=" + userName + ", password=" + password + ", driverClass=" + driverClass
				+ ", jdbcUrl=" + jdbcUrl + ", initPoolSize=" + initPoolSize + ", maxPoolSize=" + maxPoolSize + "]";
	}
	
	
}
