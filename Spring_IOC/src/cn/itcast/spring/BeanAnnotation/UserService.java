package cn.itcast.spring.BeanAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//ʹ��@Componentע����ʵ�������Bean���������ע��Ĳ��������Bean��ID
@Component("userService")
public class UserService {

	//����ͨ�����Խ���ע��ʹ��@Valueע��
	@Value("����")
	private String name;
	
	@Autowired(required=false)//��ʾ�������쳣������ע��;����ʹ��@Autowiredע���ǰ������ͽ���װ���
	@Qualifier(value="cardao")//ʹ��@Qualifierע�⣬���䰴�����ƽ���װ��	
	//�����CarDao�����õ�ʱ��û������Id����Ĭ�ϵ�ID��carDao�����������ID��һ����Ҫ�����õ�ID����һ�£��������ִ���
	private CarDao carDao;
	
	public void sayHello(){
		System.out.println("Hello");
	}

	@Override
	public String toString() {
		return name+"  "+carDao;
	}
	
	
	
}
