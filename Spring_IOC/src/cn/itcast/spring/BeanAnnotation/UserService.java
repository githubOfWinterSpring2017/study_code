package cn.itcast.spring.BeanAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//使用@Component注解来实例化这个Bean，传入这个注解的参数是这个Bean的ID
@Component("userService")
public class UserService {

	//对普通的属性进行注入使用@Value注解
	@Value("张三")
	private String name;
	
	@Autowired(required=false)//表示不忽略异常，进行注入;单独使用@Autowired注解是按照类型进行装配的
	@Qualifier(value="cardao")//使用@Qualifier注解，让其按照名称进行装配	
	//，如果CarDao在配置的时候没有设置Id，则默认的ID是carDao，如果配置了ID则一定需要与配置的ID保持一致，否则会出现错误
	private CarDao carDao;
	
	public void sayHello(){
		System.out.println("Hello");
	}

	@Override
	public String toString() {
		return name+"  "+carDao;
	}
	
	
	
}
