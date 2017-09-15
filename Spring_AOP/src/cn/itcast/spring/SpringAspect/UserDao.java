package cn.itcast.spring.SpringAspect;

/**
 * 目标类实现了接口，在Spring中使用JDK动态代理来实现Spring的Aop编程
 * @author Administrator
 *
 */
public interface UserDao {
	public void add();
	public void find();
	public void update();
	public void delete();
}
