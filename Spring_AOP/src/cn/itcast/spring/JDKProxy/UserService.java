package cn.itcast.spring.JDKProxy;

/**
 * JDK自带的动态代理是对实现了接口的类生成代理，因此需要提供接口
 * @author Administrator
 *
 */

public interface UserService {

	public void add();
	public void delete();
	
}
