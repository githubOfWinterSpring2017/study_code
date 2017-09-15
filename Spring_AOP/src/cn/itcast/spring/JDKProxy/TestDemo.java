package cn.itcast.spring.JDKProxy;

import org.junit.Test;

public class TestDemo {

	@Test
	public void test(){
		UserService userService = new UserServiceDao();
		UserService proxy = new JDKProxy(userService).getProxy();
		proxy.add();
		proxy.delete();
	}
	
}
