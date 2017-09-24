package cn.itcast.spring.SpringTransactionManagerByHand;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 这个类在beas.xml文件中被注入了
 * @author Administrator
 *
 */
public class AccountServiceImpl implements AccountService{

	
	private AccountDao accountDao;
	private TransactionTemplate transactionTemplate;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	/**
	 * 转账的具体实现
	 */
	public void transfer(final String from, final String to, final Double money) {
		
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				accountDao.out(from, money);
				//如果在这个内部出现了异常，则这个事务不会被提交，也就是说数据库中的数据不会被改变
				accountDao.in(to, money);
			}
		});
		
	}

}
