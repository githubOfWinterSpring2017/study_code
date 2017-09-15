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
 * ��ǿ�Ĵ��룬ʹ��XML�ķ�ʽ
 * 
 * @author Administrator
 *
 */
// ����һ��������
public class UserDaoAspect {

	public void before(JoinPoint joinPoint) {
		System.out.println("ǰ����ǿ" + joinPoint);
	}

	public void after(Object returnVal) {
		System.out.println("����֪ͨ,����ֵ�ǣ�" + returnVal);
	}

	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("����ǰ֪ͨ!");
		// ����Ŀ�귽����ִ��
		proceedingJoinPoint.proceed();
		System.out.println("���ƺ�֪ͨ��");
	}

	public void afterTrowing(Throwable e) {
		System.out.println("������˼�������г������쳣" + e.getMessage());
	}

	public void finall() {
		System.out.println("����֪ͨ�����۳����Ƿ�����쳣����֪ͨ����ִ��");
	}	
}
