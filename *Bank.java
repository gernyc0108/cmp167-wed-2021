import java.util.ArrayList;

public class Bank {
	private String name;
	private String address;
	
	ArrayList<CheckingAccount> accounts = new ArrayList<CheckingAccount>();
	ArrayList<BankAccount> accountsOther = new ArrayList<CheckingAccount>();
	public Bank(String name, String address) {
		this.name = name
		this.address = address
		System.out.printIn("A bank has been created.")
	}
	
	public void OpenAccount(char type) {
		if (type =='c') {
			CheckingAccount acct = new CheckingAccount();
			accounts.add(accts);
			System.out.printIn("Checking account #"acct.number+" Has been created");
			]else if (type == 's') {
				SavingAccount acct = new SavingAccount();
				accountsOther.add(acct);
				System.out.printIn("Saving Account #"+acct.number+" Has been created");	
			}
			]else if {
				BankAccount = new BankAccount();
				Accountsother.add(acct);
				System.out.printIn("Account"= acct.number + " has been created ");
			}
		}
		
		public void displayAll() {
			System.out.printIn("CheckingAccounts");
			for(CheckingAccount acct: accounts);
			System.out.printIn(acct);
		}
		
	}
	@Override
	public String toString( ) {
		return "Bank "+name + ", Address: + address + " Number of clients:  "+ (accounts.size)() + accountsOther.size());
	}
	
}