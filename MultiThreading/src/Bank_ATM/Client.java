package Bank_ATM;

public class Client {

	public static void main(String[] args) {
		
		Account account =new Account();
		AccountHolder accountHolder=new AccountHolder(account);
		Thread t1=new Thread(accountHolder);
		Thread t2=new Thread(accountHolder);
		
		t1.setName("Swathi");
		t2.setName("Meghana");
		t1.start();
		t2.start();

	}

}
