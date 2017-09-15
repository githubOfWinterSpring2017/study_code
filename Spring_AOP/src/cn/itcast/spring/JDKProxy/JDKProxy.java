package cn.itcast.spring.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * �������������Ŀ����Ĵ���
 * @author Administrator
 *
 */
public class JDKProxy implements InvocationHandler {

	//Ŀ����
	private UserService userService;
	//�ڹ����ʱ��ʵ����Ŀ����
	public JDKProxy(UserService userService) {
		this.userService = userService;		
	}
	/**
	 * ���ش����߶���
	 * @return
	 */
	public UserService getProxy(){
		UserService proxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), this);
		return proxy;
	}
	/**
	 * ����Ŀ������κη���������ñ�����
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//ʵ�ֶ�UserService�е�add����������ǿ
		if("add".equals(method.getName())){
			System.out.println("��"+method.getName()+"������ǿ...");
			Object obj = method.invoke(userService, args);
			return obj;
		}
		return method.invoke(userService, args);
	}

}
