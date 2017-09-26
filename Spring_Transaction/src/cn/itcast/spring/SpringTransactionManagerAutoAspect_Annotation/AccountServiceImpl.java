package cn.itcast.spring.SpringTransactionManagerAutoAspect_Annotation;

import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly=false)
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
		int a = 1/0;
		accountDao.in(to, money);
	}

}
