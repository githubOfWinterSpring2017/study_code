package cn.itcast.spring.SpringAspectJAnnotation;

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
 * 使用注解的方式定义切面
 *
 * @author 黎飞红
 * @Date 2017年8月31日
 *
 */
// 定义一个切面
@Aspect
public class UserDaoAspect {

	// 定义一个前置通知 星号代表返回值类型，后面是方法的名称，在方法的括号中的两个点代表方法的形参
	// @Before这个注解表明这是一个前置通知类型，并且在before方法中可以携带一个JointPoint，这个参数用于返回当前被增强的方法有哪些
	@Before("execution(* cn.itcast.spring.SpringAspectJAnnotation.UserDao.add(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("前置增强" + joinPoint);
	}

	// 后置增强，用于返回方法的返回值，在这个通知中同样也有JointPoint这个参数，另外还有一个用户得到方法返回值的参数
	// 需要注意的是方法的形参应该与在后置通知的returning中声明的一样
	/*
	 * @AfterReturning(
	 * value="execution(* cn.itcast.spring.SpringAspectJAnnotation.UserDao.update(..))"
	 * ,returning="returnVal") public void after(Object returnVal){
	 * System.out.println("后置通知,返回值是："+returnVal); }
	 */

	// 环绕通知，这个通知可以阻止目标方法的执行，在这个通知中有一个参数ProceedingJoinPoint
	@Around("execution(* cn.itcast.spring.SpringAspectJAnnotation.UserDao.delete(..))")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("环绕前通知!");
		// 代表目标方法的执行
		proceedingJoinPoint.proceed();
		System.out.println("环绕后通知！");
	}

	// 出现异常错误的时候会进行通知，并且可以打印出错误的信息
	@AfterThrowing(value = "execution(* cn.itcast.spring.SpringAspectJAnnotation.UserDao.delete(..))", throwing = "e")
	public void afterTrowing(Throwable e) {
		System.out.println("不好意思，程序中出现了异常" + e.getMessage());
	}

	// 最终通知，无论程序运行过程中是否出现异常都会执行这个通知
	@After("execution(* cn.itcast.spring.SpringAspectJAnnotation.UserDao.find(..))")
	public void finall() {
		System.out.println("最终通知，无论程序是否出现异常，该通知都会执行");
	}

	// 定义切点
	@Pointcut("execution(* cn.itcast.spring.SpringAspectJAnnotation.UserDao.update(..))")
	private void myPointCut() {
	}

	// 应用切点，这样做是为了提高代码的开发效率
	@AfterReturning(value = "UserDaoAspect.myPointCut()", returning = "returnVal")
	public void afterTwo(Object returnVal) {
		System.out.println("后置通知,返回值是：" + returnVal);
	}

}
