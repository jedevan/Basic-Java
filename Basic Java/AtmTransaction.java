import java.util.Scanner;
public class AtmTransaction {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String name;
		String type;
		int balance = 5000;
		int withdraw;
		int total;
	
		System.out.println("Enter Account Holder Name: ");
		name = scan.nextLine();
		
		System.out.println("Account Type (Savings/Current): ");
		type = scan.nextLine();
		
		System.out.println("Current Balance: " + balance);
		
		System.out.println("Amount of Withdraw: ");
		withdraw = scan.nextInt();

		if (withdraw <= 0) {
			System.out.println("Invalid Withdrawal Amount");
		} else if (withdraw > balance) {
			System.out.println("Insuficient Balance");
		} else if (type.equalsIgnoreCase("Savings")) {


		total = balance - withdraw;
				
		if (type == "Savings") { 
			total = balance - withdraw;

		if (total >= 1000) { 
			System.out.println("----- ATM TRANSACTION RESULT -----");
			System.out.println("Transaction Status: Withdrawal Successful");
			System.out.println("Remaining Balance: $+Total");
		} else {
			System.out.println("Insufficient Balance");
		}					
			
		} else if (type.equalsIgnoreCase("Current")) {
			
		total = balance - withdraw;
		
		if (total >= 0) { 
			System.out.println("----- ATM TRANSACTION RESULT -----");
			System.out.println("Transaction Status: Withdrawal Successful");
			System.out.println("Remaining Balance: $+Total");
		} else {
			System.out.println("Insufficient Balance");
		}					
		
		} else {
			System.out.println("Invalid Account Type: ");
		}
		scan.close();


			
		
}

}
}		
