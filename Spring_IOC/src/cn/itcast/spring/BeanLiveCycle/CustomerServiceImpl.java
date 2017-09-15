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
		System.out.println("第一步：调用构造方法，对类进行初始化操作.....");
	}
	
	public String getName() {		
		return name;
	}
	public void setName(String name) {
		System.out.println("第二步：调用这个类的Set方法完成属性的注入....."+name);
		this.name = name;
	}

	public void add() {
		System.out.println("这是Add方法....");
	}

	public void find() {
		System.out.println("这是find方法....");
	}
	public void setup(){
		System.out.println("第七步：如果在配置文件中配置的init-method方法，则调用这个方法");
	}
	public void teardown(){
		System.out.println("第十一步：如果在配置文件中配置了destroy-method方法，则调用这个方法");
	}
	
	
	//传入的name就是在配置文件中配置的id或者name
	public void setBeanName(String name) {
		System.out.println("第三步：如果这个类实现了BeanNameAware接口，调用这个接口中的本方法："+name);
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("第四步：如果这个类实现了BeanFactoryAware接口，则调用这个接口中的本方法");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("第六步：如果这个类实现了InitializingBean接口，则调用这个接口中的本方法");
	}

	public void destroy() throws Exception {
		System.out.println("第十步：如果这个类实现了DisposableBean接口，则调用这个接口中的本方法");
	}

}
