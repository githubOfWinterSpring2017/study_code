package cn.itcast.spring.SpringAdvisor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class UserDaoImpl implements UserDao{
	
	public void add(){
		System.out.println("����û��ɹ�");
	}
	public void find(){
		System.out.println("�����û��ɹ�");
	}
	public void update() {
		System.out.println("�����û��ɹ�");
	}
	public void delete() {
		System.out.println("ɾ���û��ɹ�");
	}

}
