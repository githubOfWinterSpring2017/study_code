package cn.itcast.spring.SpringAspect;

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
