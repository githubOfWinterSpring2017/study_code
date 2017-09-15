package cn.itcast.spring.BeanAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

//使用注解方式注入Bean的时候，如果没有在括号中为Bean设置Id，则这个Bean默认的Id就是这个类的类名首字母小写后的类名
@Repository(value="cardao")
public class CarDao {

	@Value(value="宝马")
	private String name;
	
	@Value(value="23323.00")
	private float price;

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
		return "CarDao [name=" + name + ", price=" + price + "]";
	}
	
	
}
