package cn.itcast.spring.SpringTransactionStart;
/**
 * 账户操作DAO
 * @author Administrator
 *
 */
public interface AccountDao {

	/**
	 * 寄钱
	 * @param from
	 * @param money
	 */
	public void out(String from,Double money);
	/**
	 * 存钱
	 * @param to
	 * @param money
	 */
	public void in(String to,Double money) ;
}
