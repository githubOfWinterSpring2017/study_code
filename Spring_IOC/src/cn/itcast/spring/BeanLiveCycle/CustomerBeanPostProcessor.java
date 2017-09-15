package cn.itcast.spring.BeanLiveCycle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * ע�⣺�������͵ڰ˲��Ǻ���Ҫ�ģ����������п���ʵ�ֶ����bean�������ǿ�Ĳ���
 * @author Administrator
 *
 */
public class CustomerBeanPostProcessor implements BeanPostProcessor {

	/**
	 * bean����ʵ����Ķ��� beanName:�������ļ���Ϊ��������õ�id����name
	 * ����������bean��������ǿ����ֱ�ӷ���bean���ɣ������Ҫ��ǿ�������Ӧ�Ĵ���
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("���岽�����һ����ʵ����BeanPostProcessor");
		return bean;
	}
	/**
	 * ʵ����ִ��add����֮ǰ����Ȩ�޵�У�飬ʹ�ö�̬����
	 */
	public Object postProcessAfterInitialization(final Object bean, String beanName)
			throws BeansException {
		System.out.println("�ڰ˲������һ������ʵ����BeanPostProcessor");
		//������������������bean��ʵ������ʱ��Ҳ�ᱻSpring�������ã���������Ҫ���ض���bean������ǿ����Ҫ�����ж�
		//������ֻ��customerService����������ǿ
		if(beanName.equals("customerService")){
			//�õ��������
			Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler(){
				//����Ŀ����ķ�����ʱ�����ڵ���invoke����
				public Object invoke(Object proxy, Method method, Object[] args)
						throws Throwable {
					//���ڵ���Ŀ������κη�����ʱ�򶼻���ñ�������������ֻ����Ҫ�ڵ���Ŀ�����ָ��������ʱ�������ǿ�����Խ����ж�
					//��Ŀ�����add����������ǿ
					if("add".equals(method.getName())){
						System.out.println("���������Ȩ���ж�......");
						Object obj = method.invoke(bean, args);
						return obj;
					}//����ֱ�ӵ����������					
					return method.invoke(bean, args);
				}				
			});
			//�����customerService�����Ļ����򷵻������Ĵ����߶���
			return proxy;
		}//���򷵻�������ԭ����
		return bean;
	}

}
