package cn.itcast.spring.SpringAdvisor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class UserDaoImpl implements UserDao{
	
	public void add(){
		System.out.println("添加用户成功");
	}
	public void find(){
		System.out.println("查找用户成功");
	}
	public void update() {
		System.out.println("更新用户成功");
	}
	public void delete() {
		System.out.println("删除用户成功");
	}

}
