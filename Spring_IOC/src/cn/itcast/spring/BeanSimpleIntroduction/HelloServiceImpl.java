package cn.itcast.spring.BeanSimpleIntroduction;

public class HelloServiceImpl implements HelloService {

	private String info;
	
	
	
	public void setInfo(String info) {
		this.info = info;
	}



	public void sayHello() {
		System.out.println("Hello Spring"+info);		
	}

}
