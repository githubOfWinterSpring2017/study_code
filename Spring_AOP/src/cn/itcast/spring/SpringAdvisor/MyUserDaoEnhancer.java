package cn.itcast.spring.SpringAdvisor;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;

/**
 * �������д���ǵ����棺����֪��������������֪ͨ�ļ��ϡ�����������������ֻ������֪ͨ�������ζ�Ż��Ŀ���������з���������ǿ
 * @author Administrator
 *
 */
public class MyUserDaoEnhancer implements  MethodBeforeAdvice{

	public void before(Method method, Object[] arg, Object target) throws Throwable {
		System.out.println("ǰ����ǿ.......");
	}


	
}
