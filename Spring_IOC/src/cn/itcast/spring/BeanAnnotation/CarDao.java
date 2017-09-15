package cn.itcast.spring.BeanAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

//ʹ��ע�ⷽʽע��Bean��ʱ�����û����������ΪBean����Id�������BeanĬ�ϵ�Id������������������ĸСд�������
@Repository(value="cardao")
public class CarDao {

	@Value(value="����")
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
