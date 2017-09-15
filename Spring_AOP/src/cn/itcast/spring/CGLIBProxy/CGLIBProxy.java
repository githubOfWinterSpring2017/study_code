package cn.itcast.spring.CGLIBProxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;


/**
 * CGLIB���Զ�û��ʵ�ֽӿڵ������ɶ�̬�������ַ�ʽ���ɶ�̬�����ǲ��ü̳еķ�ʽ��������Ŀ���������ķ�ʽ
 * @author Administrator
 *
 */
public class CGLIBProxy implements MethodInterceptor{
	//Ŀ����
	private UserServiceDao userService;
	//������������ʱ��ʵ����Ŀ����
	public CGLIBProxy(UserServiceDao userService) {
		this.userService = userService;
	}
	public UserServiceDao getProxy(){
		//1������������
		Enhancer  enhancer = new Enhancer();
		//2�����ø���
		enhancer.setSuperclass(userService.getClass());
		//3�����ûص�
		enhancer.setCallback(this);
		//4����������
		return (UserServiceDao) enhancer.create();
		
	}
	/**
	 * ����Ŀ������κη�����������������
	 */
	public Object intercept(Object proxy, Method method, Object[] args,
			MethodProxy proxyMethod) throws Throwable {
		
		if("add".equals(method.getName())){
			System.out.println("������ǿ����......");
			//���Ǵ�͸����ı�׼д������ȻҲ�ǿ���ʹ��method����invoke����
			Object obj = proxyMethod.invoke(userService, args);
			return obj;
		}
		return proxyMethod.invoke(userService, args);
	}
	
	
	
}
