package cn.itcast.spring.SpringTransactionManagerByHand;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cn/itcast/spring/SpringTransactionManagerByHand/beans.xml")
public class SpringStartTest {

	@Autowired
	@Qualifier("accountService")
	private AccountService accountService;
	
	@Test
	public void demo01(){
		//从aa账户向bb账户转账100元，这样就导致aa账户减少一百元，而bb账户增加100元
		accountService.transfer("aaa", "bbb", 100d);
	}
	
}
