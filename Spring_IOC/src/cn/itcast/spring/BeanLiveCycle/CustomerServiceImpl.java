package cn.itcast.spring.BeanLiveCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CustomerServiceImpl implements CustomerService,BeanNameAware,BeanFactoryAware,InitializingBean ,DisposableBean   {

	private String name;
	
	public CustomerServiceImpl() {
		System.out.println("��һ�������ù��췽����������г�ʼ������.....");
	}
	
	public String getName() {		
		return name;
	}
	public void setName(String name) {
		System.out.println("�ڶ���������������Set����������Ե�ע��....."+name);
		this.name = name;
	}

	public void add() {
		System.out.println("����Add����....");
	}

	public void find() {
		System.out.println("����find����....");
	}
	public void setup(){
		System.out.println("���߲�������������ļ������õ�init-method������������������");
	}
	public void teardown(){
		System.out.println("��ʮһ��������������ļ���������destroy-method������������������");
	}
	
	
	//�����name�����������ļ������õ�id����name
	public void setBeanName(String name) {
		System.out.println("����������������ʵ����BeanNameAware�ӿڣ���������ӿ��еı�������"+name);
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("���Ĳ�����������ʵ����BeanFactoryAware�ӿڣ����������ӿ��еı�����");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("����������������ʵ����InitializingBean�ӿڣ����������ӿ��еı�����");
	}

	public void destroy() throws Exception {
		System.out.println("��ʮ������������ʵ����DisposableBean�ӿڣ����������ӿ��еı�����");
	}

}
