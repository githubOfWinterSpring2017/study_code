package cn.itcast.spring.JDKProxy;

/**
 * Ŀ���ࣺĿ����ʵ���˽ӿ�
 * @author Administrator
 *
 */
public class UserServiceDao implements UserService {

	public void add() {
		System.out.println("ִ������û��Ĳ���.....");
	}

	public void delete() {
		System.out.println("ִ��ɾ���û��Ĳ���");
	}

}
