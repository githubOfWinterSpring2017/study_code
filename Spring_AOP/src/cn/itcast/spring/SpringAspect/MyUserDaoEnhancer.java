package cn.itcast.spring.SpringAspect;

import org.aopalliance.intercept.MethodInvocation;

/**
 * 在这里使用环绕增强
 * 需要注意的一点是：导包的时候需要到AOP联盟的包
 * @author Administrator
 *
 */
public class MyUserDaoEnhancer implements org.aopalliance.intercept.MethodInterceptor{

	/**
	 * 调用目标类的任何方法都会调用到本方法
	 */
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("环绕前增强!");
		Object obj = methodInvocation.proceed();
		System.out.println("环绕后增强");
		return obj;
	}
	
	
}
