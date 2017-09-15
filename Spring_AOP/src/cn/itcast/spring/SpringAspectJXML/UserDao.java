package cn.itcast.spring.SpringAspectJXML;

/**
 * 目标类实现了接口，在Spring中使用JDK动态代理来实现Spring的Aop编程
 * @author Administrator
 *
 */
public class UserDao {
	public void add(){
		System.out.println("添加用户");
	}
	public void find(){
		System.out.println("查找用户");
	}
	public int update(){
		System.out.println("更新用户");
		return 1;
	}
	public void delete(){
		System.out.println("删除用户");
	}
}
