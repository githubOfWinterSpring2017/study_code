package cn.itcast.spring.SpringAspect;

import org.aopalliance.intercept.MethodInvocation;

/**
 * ������ʹ�û�����ǿ
 * ��Ҫע���һ���ǣ�������ʱ����Ҫ��AOP���˵İ�
 * @author Administrator
 *
 */
public class MyUserDaoEnhancer implements org.aopalliance.intercept.MethodInterceptor{

	/**
	 * ����Ŀ������κη���������õ�������
	 */
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("����ǰ��ǿ!");
		Object obj = methodInvocation.proceed();
		System.out.println("���ƺ���ǿ");
		return obj;
	}
	
	
}
