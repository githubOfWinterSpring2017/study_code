package cn.itcast.spring.SpringTransactionStart;

public class AccountServiceImpl implements AccountService{

	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	/**
	 * 转账的具体实现
	 */
	public void transfer(String from, String to, Double money) {
		accountDao.out(from, money);
		accountDao.in(to, money);
	}

}
