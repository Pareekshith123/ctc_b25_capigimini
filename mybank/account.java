package mybank;

import java.util.Scanner;

public class account {
	int balance;
	int pretransac;
	String customerName;
	String customerid;
	account(String cname,String cid){
		customerName=cname;
		 customerid=cid;
	}
	void deposit(int amount) {
		if(amount!=0) {
			balance=balance+amount;
			pretransac=-amount;
		}
	}
	void withdraw(int amount)
	{
		if(amount!=0) {
		balance=balance-amount;
		pretransac=-amount;
	}
	
		
	}	
	
	void getprevioustransaction() {
		if(pretransac>0) {
			System.out.println("Deposited"+pretransac);
		}
		else if(pretransac<0) {
			System.out.println("withdrawn:"+Math.abs(pretransac));
		}
		else {
			System.out.println("No transaction occured");
			
		}
	}
	void showmenu() {
		char option='\0';
		Scanner sc =new Scanner(System.in);
		System.out.println("Welcome!!"+customerName);
		System.out.println("your ID is"+customerid);
		System.out.println("\n");
		System.out.println("enter A to check balance ");
		System.out.println("enter B to Deposite ");
		System.out.println("enter C to Withdraw ");
		System.out.println("enter D to know previous transaction ");
		System.out.println("enter E to exit ");
		do {
			System.out.println("$@$@3#######################################$#@#$$");
		    System.out.println("Enter an option");
		    System.out.println("$@$@3#######################################$#@#$$");
		    option =sc.next().charAt(0);
		
		    System.out.println("\n");
		switch(option) {
		case 'A':
			System.out.println("---------------------------------------------");
			System.out.println("Balance="+balance);
			
			System.out.println("----------------------------------------------");
			System.out.println("\n");
			
			
		
			break;
		case 'B':
			System.out.println("---------------------------------------------");
			System.out.println("Enter an amount to deposit:");
			
			System.out.println("----------------------------------------------");
			int amount =sc.nextInt();
			
			deposit(amount);
			System.out.println("\n");
			break;
		case 'C':
			System.out.println("---------------------------------------------");
			System.out.println("Enter an amount to withdraw:");
			
			System.out.println("----------------------------------------------");
			int amount2 =sc.nextInt();
			
			withdraw(amount2);
				System.out.println("\n");
				break;
		case 'D':
			System.out.println("---------------------------------------------");
			getprevioustransaction();
			System.out.println("----------------------------------------------");
			
			System.out.println("\n");
			break;
		case 'E':
			System.out.println("******thank you ************");
			break;		 
		default:
			System.out.println("Invalid option!! please enter again");
				break;
				
		}
		
		
		}while(option!='E');
		
		System.out.println(" thank you for using our service");
		
		
		
	}
	
}
