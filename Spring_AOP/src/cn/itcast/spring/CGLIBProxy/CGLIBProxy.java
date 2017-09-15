package cn.itcast.spring.CGLIBProxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;


/**
 * CGLIB可以对没有实现接口的类生成动态代理，这种方式生成动态代理是采用继承的方式，即生成目标类的子类的方式
 * @author Administrator
 *
 */
public class CGLIBProxy implements MethodInterceptor{
	//目标类
	private UserServiceDao userService;
	//在生成这个类的时候实例化目标类
	public CGLIBProxy(UserServiceDao userService) {
		this.userService = userService;
	}
	public UserServiceDao getProxy(){
		//1、创建核心类
		Enhancer  enhancer = new Enhancer();
		//2、设置父类
		enhancer.setSuperclass(userService.getClass());
		//3、设置回调
		enhancer.setCallback(this);
		//4、创建代理
		return (UserServiceDao) enhancer.create();
		
	}
	/**
	 * 调用目标类的任何方法都会调用这个方法
	 */
	public Object intercept(Object proxy, Method method, Object[] args,
			MethodProxy proxyMethod) throws Throwable {
		
		if("add".equals(method.getName())){
			System.out.println("这是增强代码......");
			//这是穿透代码的标准写法，当然也是可以使用method调用invoke方法
			Object obj = proxyMethod.invoke(userService, args);
			return obj;
		}
		return proxyMethod.invoke(userService, args);
	}
	
	
	
}
