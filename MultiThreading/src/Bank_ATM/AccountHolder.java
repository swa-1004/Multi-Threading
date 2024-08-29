package Bank_ATM;

public class AccountHolder implements Runnable{
	
	private Account account;
	
	public AccountHolder(Account account)
	{
		this.account=account;
	}
	
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			makeWithdrawal(2000);
			if(account.getBalance()<0)
			{
				System.out.println("Account is overdrawn!");
			}
		}
	}
	
	public synchronized void makeWithdrawal(int withdrawAmount)
	{
		if(account.getBalance()>=withdrawAmount)
		{
			System.out.println(Thread.currentThread().getName()+" is going to withdraw $ "+withdrawAmount);
			try
			{
				Thread.sleep(3000);
				
			}
			catch(InterruptedException IE)
			{
				
			}
			
			account.withdraw(withdrawAmount);
			System.out.println(Thread.currentThread().getName()+" completes the withdrawal of $ "+withdrawAmount);
		}
		else
		{
			System.out.println("Not enough in account for "+Thread.currentThread().getName()+" to withdraw and your balance is "+account.getBalance());
		
		
		
		
	}
	
	}
}
