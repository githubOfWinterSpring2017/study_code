package cn.itcast.spring.CGLIBProxy;

import org.junit.Test;

public class TestDemo {

	@Test
	public void test(){
		UserServiceDao userService = new UserServiceDao();
		UserServiceDao proxy = new CGLIBProxy(userService).getProxy();
		proxy.add();
		proxy.delete();
	}
	
}
