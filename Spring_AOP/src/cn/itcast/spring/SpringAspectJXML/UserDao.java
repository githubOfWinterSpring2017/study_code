package cn.itcast.spring.SpringAspectJXML;

/**
 * Ŀ����ʵ���˽ӿڣ���Spring��ʹ��JDK��̬������ʵ��Spring��Aop���
 * @author Administrator
 *
 */
public class UserDao {
	public void add(){
		System.out.println("����û�");
	}
	public void find(){
		System.out.println("�����û�");
	}
	public int update(){
		System.out.println("�����û�");
		return 1;
	}
	public void delete(){
		System.out.println("ɾ���û�");
	}
}
