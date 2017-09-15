package cn.itcast.spring.SpringSPEL;

public class UserServiceImpl {

	private String name;
	private Car car;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "UserServiceImpl [name=" + name + ", car=" + car + "]";
	}
	
	
	
}
