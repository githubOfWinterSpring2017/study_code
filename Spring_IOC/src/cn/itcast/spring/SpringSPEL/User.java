package cn.itcast.spring.SpringSPEL;

public class User {
	
	private String name;
	private int age;
	
	public User(){
		System.out.println("通过空构造方法初始化User!");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	

}
