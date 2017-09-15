package cn.itcast.spring.SpringSPEL;

public class Car {
	
	private String name;
	private float price;
	
	public Car(){
		System.out.println("通过空构造进行初始化Car！");
	}
	
	public Car(String name,float price){
		this.name =name;
		this.price = price;
		System.out.println("通过有参构造器初始化Car!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
}
