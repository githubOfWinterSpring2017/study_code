package cn.itcast.spring.SpringAspectJXML;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 增强的代码，使用XML的方式
 * 
 * @author Administrator
 *
 */
// 定义一个切面类
public class UserDaoAspect {

	public void before(JoinPoint joinPoint) {
		System.out.println("前置增强" + joinPoint);
	}

	public void after(Object returnVal) {
		System.out.println("后置通知,返回值是：" + returnVal);
	}

	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("环绕前通知!");
		// 代表目标方法的执行
		proceedingJoinPoint.proceed();
		System.out.println("环绕后通知！");
	}

	public void afterTrowing(Throwable e) {
		System.out.println("不好意思，程序中出现了异常" + e.getMessage());
	}

	public void finall() {
		System.out.println("最终通知，无论程序是否出现异常，该通知都会执行");
	}	
}
