package cn.itcast.spring.SpringAdvisor;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;

/**
 * 在这里编写我们的切面：我们知道切面是切入点和通知的集合。在下面的这个切面中只定义了通知，这就意味着会对目标对象的所有方法都会增强
 * @author Administrator
 *
 */
public class MyUserDaoEnhancer implements  MethodBeforeAdvice{

	public void before(Method method, Object[] arg, Object target) throws Throwable {
		System.out.println("前置增强.......");
	}


	
}
