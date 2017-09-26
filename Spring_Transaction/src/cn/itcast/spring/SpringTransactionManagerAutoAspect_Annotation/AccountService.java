package cn.itcast.spring.SpringTransactionManagerAutoAspect_Annotation;

public interface AccountService {
	/**
	 * 转账
	 * @param from
	 * @param to
	 * @param money
	 */
	public void transfer(String from ,String to,Double money);
}
