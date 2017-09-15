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
 * ʹ��ע��ķ�ʽ��������
 *
 * @author ��ɺ�
 * @Date 2017��8��31��
 *
 */
// ����һ������
@Aspect
public class UserDaoAspect {

	// ����һ��ǰ��֪ͨ �ǺŴ�����ֵ���ͣ������Ƿ��������ƣ��ڷ����������е���������������β�
	// @Before���ע���������һ��ǰ��֪ͨ���ͣ�������before�����п���Я��һ��JointPoint������������ڷ��ص�ǰ����ǿ�ķ�������Щ
	@Before("execution(* cn.itcast.spring.SpringAspectJAnnotation.UserDao.add(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("ǰ����ǿ" + joinPoint);
	}

	// ������ǿ�����ڷ��ط����ķ���ֵ�������֪ͨ��ͬ��Ҳ��JointPoint������������⻹��һ���û��õ���������ֵ�Ĳ���
	// ��Ҫע����Ƿ������β�Ӧ�����ں���֪ͨ��returning��������һ��
	/*
	 * @AfterReturning(
	 * value="execution(* cn.itcast.spring.SpringAspectJAnnotation.UserDao.update(..))"
	 * ,returning="returnVal") public void after(Object returnVal){
	 * System.out.println("����֪ͨ,����ֵ�ǣ�"+returnVal); }
	 */

	// ����֪ͨ�����֪ͨ������ֹĿ�귽����ִ�У������֪ͨ����һ������ProceedingJoinPoint
	@Around("execution(* cn.itcast.spring.SpringAspectJAnnotation.UserDao.delete(..))")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("����ǰ֪ͨ!");
		// ����Ŀ�귽����ִ��
		proceedingJoinPoint.proceed();
		System.out.println("���ƺ�֪ͨ��");
	}

	// �����쳣�����ʱ������֪ͨ�����ҿ��Դ�ӡ���������Ϣ
	@AfterThrowing(value = "execution(* cn.itcast.spring.SpringAspectJAnnotation.UserDao.delete(..))", throwing = "e")
	public void afterTrowing(Throwable e) {
		System.out.println("������˼�������г������쳣" + e.getMessage());
	}

	// ����֪ͨ�����۳������й������Ƿ�����쳣����ִ�����֪ͨ
	@After("execution(* cn.itcast.spring.SpringAspectJAnnotation.UserDao.find(..))")
	public void finall() {
		System.out.println("����֪ͨ�����۳����Ƿ�����쳣����֪ͨ����ִ��");
	}

	// �����е�
	@Pointcut("execution(* cn.itcast.spring.SpringAspectJAnnotation.UserDao.update(..))")
	private void myPointCut() {
	}

	// Ӧ���е㣬��������Ϊ����ߴ���Ŀ���Ч��
	@AfterReturning(value = "UserDaoAspect.myPointCut()", returning = "returnVal")
	public void afterTwo(Object returnVal) {
		System.out.println("����֪ͨ,����ֵ�ǣ�" + returnVal);
	}

}
