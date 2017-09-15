package cn.itcast.spring.BeanLiveCycle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 注意：第六步和第八步是很重要的，在这两步中可以实现对这个bean类进行增强的操作
 * @author Administrator
 *
 */
public class CustomerBeanPostProcessor implements BeanPostProcessor {

	/**
	 * bean：类实例后的对象 beanName:在配置文件中为这个类设置的id或者name
	 * 如果对于这个bean不进行增强，则直接返回bean即可，如果需要增强则添加相应的代码
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("第五步：如果一个类实现了BeanPostProcessor");
		return bean;
	}
	/**
	 * 实现在执行add方法之前进行权限的校验，使用动态代理
	 */
	public Object postProcessAfterInitialization(final Object bean, String beanName)
			throws BeansException {
		System.out.println("第八步：如果一个类中实现了BeanPostProcessor");
		//由于这个类对于其他的bean在实例化的时候也会被Spring容器调用，因此如果需要对特定的bean进行增强，需要进行判断
		//在这里只对customerService这个类进行增强
		if(beanName.equals("customerService")){
			//得到代理对象
			Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler(){
				//调用目标类的方法的时候都是在调用invoke方法
				public Object invoke(Object proxy, Method method, Object[] args)
						throws Throwable {
					//由于调用目标类的任何方法的时候都会调用本方法，因此如果只是需要在调用目标类的指定方法的时候进行增强，可以进行判断
					//对目标类的add方法进行增强
					if("add".equals(method.getName())){
						System.out.println("在这里进行权限判断......");
						Object obj = method.invoke(bean, args);
						return obj;
					}//否则直接调用这个方法					
					return method.invoke(bean, args);
				}				
			});
			//如果是customerService类对象的话，则返回这个类的代理者对象
			return proxy;
		}//否则返回这个类的原对象
		return bean;
	}

}
