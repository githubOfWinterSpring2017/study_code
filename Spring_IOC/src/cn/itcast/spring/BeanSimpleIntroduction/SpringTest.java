package cn.itcast.spring.BeanSimpleIntroduction;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class SpringTest {

	@Test
	public void demo01() {
		HelloService helloService = new HelloServiceImpl();
		helloService.sayHello();
	}

	/**
	 * Java�Ķ�̬����Java�����У���̬��Ҫ������ʵ����ʽ��һ���Ǽ̳У���һ���ǽӿڣ����ڽӿ�ʵ�ֵĶ�̬�Ȼ��ڼ̳�ʵ�ֵĶ�̬���ӵ����㡣
	 * ��1�����ڼ̳еĶ�̬����Java�л��ڼ̳еĶ�̬��ָ���󷽷��ĵ�����ͨ����������������еģ�Ҳ����˵ͨ�������������ָ������Ķ����������ø����ж���ķ���ʵ���ǵ�����������д�ķ�����
	 * ��2�����ڽӿڵĶ�̬����Java�л��ڽӿڵĶ�̬��ָ���󷽷��ĵ�����ͨ���ӿڵ����������еģ�Ҳ����˵ͨ���ӿڵ�������ָ��ʵ����Ķ����������ýӿ��ж���ķ���ʵ���Ͼ��ǵ���ʵ������ʵ�ֵĽӿڵķ���
	 */
	@Test
	public void demo02() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"cn/itcast/spring/BeanSimpleIntroduction/beans.xml");
		
		HelloService helloService = (HelloService) applicationContext.getBean("helloServiceImpl");
		helloService.sayHello();
	}
	
	
	public void demo03(){
		ApplicationContext ac = new FileSystemXmlApplicationContext("WebRoot/beans.xml");
		HelloService helloService = (HelloService) ac.getBean("helloServiceImpl");
		helloService.sayHello();
	}

	public void demo04(){
		//BeanFactory bf = new ClassPathXmlApplicationContext("beans.xml");
		//BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		BeanFactory bf = new FileSystemXmlApplicationContext("WebRoot/beans.xml");
		//BeanFactory bf = new XmlBeanFactory(new FileSystemResource("WebRoot/beans.xml"));
		HelloService helloService = (HelloService) bf.getBean("helloServiceImpl");
		helloService.sayHello();
	}
	
	

}
