package cn.itcast.spring.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 这个类用于生成目标类的代理
 * @author Administrator
 *
 */
public class JDKProxy implements InvocationHandler {

	//目标类
	private UserService userService;
	//在构造的时候实例化目标类
	public JDKProxy(UserService userService) {
		this.userService = userService;		
	}
	/**
	 * 返回代理者对象
	 * @return
	 */
	public UserService getProxy(){
		UserService proxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), this);
		return proxy;
	}
	/**
	 * 调用目标类的任何方法都会调用本方法
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//实现对UserService中的add方法进行增强
		if("add".equals(method.getName())){
			System.out.println("对"+method.getName()+"进行增强...");
			Object obj = method.invoke(userService, args);
			return obj;
		}
		return method.invoke(userService, args);
	}

}
