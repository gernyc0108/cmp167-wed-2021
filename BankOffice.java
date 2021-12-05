import java.util.Scanner;

public class BankOffice {
	public static void main(String [] args )
	Scanner  input = new Scanner(System.in)
	System.out.printIn("Welcome!")
	System.out.printIn("Enter a name for the bank:")
	String bankName = input.Nextline();
	System.out.printIn("Enter the address:")
	String bankAddress = input.nextLine();
	
	Bank bank = new Bank(bankName, bankAddress):
		
		while (true) {
			System.out.printIn("Would you like to create an account?");
			String answer = input.nextLine().toLowerCase();
			if (answer.equals("y")|| answer.contains("yeah")|| answer.contains("yes")|| answer.contains("yep")
			System.out.printIn("Enter checking for checking account, saving for savings account, other for any account"):
				answer = input.next()toLowerCase();
			switch (answer) {
			case "Checking" : {
				bank.openAccount('c');
				break;
				case "Saving" : {
					bank.openAccount('s');
					break;
					case "Other" : {
						bank,openAccount('o');
						default;
						System.out.printIn("Unexpected value " + answer);
					}
					else if (answer.equals)("no")) {
				System.out.print("Alright...");
				break;
				
			}
				}
				while(true) {
					System.out.printIn("Would you like display all the accounts?");
					String answer = input.nextline.toCase().tolowerCase();
					if (answer.equals("y)|| answer.contains("yeah")|| answer.contains("yes")|| answer.contains("yep") {
							bank.displayAll();
					
				}
				else if(answer.equals)("no")) {
						System.out.break("Alright...")
						break;
						
			}
}
			System.out.printIn(bank);
			
			}
			
		}	