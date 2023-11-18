package Atm;

import java.util.Scanner;

 class AtmInterface {

	private double TotalMoney;
	
	public AtmInterface(double balance) {
		TotalMoney = balance;
	}
	public double getTotalMoney() {
		return TotalMoney;
	}

	public void deposit(double amt) {
		TotalMoney += amt;
	}
	public boolean withdraw(double amt) {
	     if(amt <= TotalMoney) {
	    	 TotalMoney -= amt;
	    	 return true;
	}
	     return false;
	}
}
	class AtmBankIf 
	{
			private AtmInterface atmInterface;
			public AtmBankIf(AtmInterface atmInterface)
			{
				this.atmInterface = atmInterface;
			}
			 public void AtmOptions() {
			        System.out.println("ATM Menu:");
			        System.out.println("1. Check Balance");
			        System.out.println("2. Deposit");
			        System.out.println("3. Withdraw");
			        System.out.println("4. Exit");
			    }
			 public void run() 
			 {
				 Scanner scanner = new Scanner(System.in);
				 
				 while(true) 
				 {
					 System.out.println("             ");
					 System.out.println("              ");
					 AtmOptions();
					 System.out.println("Select An Option ......");
					 int ch = scanner.nextInt();
					 switch(ch) {
					 case 1 : System.out.println("Money Present in Your Bank is " + atmInterface.getTotalMoney());
					 		break;
					 case 2 : 	System.out.println("Enter Some Money To Deposit to Your Bank");
					 double depositamt = scanner.nextDouble();
					 atmInterface.deposit(depositamt);
					 System.out.println("Atm deposited in Your Account is " + depositamt);
					 System.out.println("Balance Available After Deposit is :" + atmInterface.getTotalMoney());
					 break;
					 case 3 : System.out.println("Enter Amount to Withdraw from Bank : ");
					 double widraw = scanner.nextDouble();
					 if(atmInterface.withdraw(widraw)) {
						 System.out.println("SuccessFully Widrawed Amount " + widraw); 
						 System.out.println("Balance Available After Widraw is " + atmInterface.getTotalMoney());
					 }
					 else 
					 {
						 System.out.println("Insuffiect Balcance To Withdraw");
					 }
					 break;
					 case 4 : System.out.println("Thanks For Using AtmBank");
					 scanner.close();
					 return;
					 default:
		                    System.out.println("Invalid option. Please select a valid option.");
					 }
				 }
	}
	}
	public class Bank {
public static void main(String[] args) {
		System.out.println("--------------------------------");
		System.out.println("Welcome to Atm Bank"); 
		AtmInterface atmInterface = new AtmInterface(500);
		AtmBankIf atmBankIf = new AtmBankIf(atmInterface);
		atmBankIf.run();
		}
	}
