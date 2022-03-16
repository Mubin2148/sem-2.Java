import java.util.Scanner;
class Bank_Account{

	 double accountNo;
	 String username,email,AccountType;
	 double balance;
	public void getAccountdetails(){

		Scanner sc=new Scanner(System.in);
		System.out.print("enter your account number: ");
		accountNo=sc.nextDouble();
		System.out.print("enter your username: ");
		username=sc.nextLine();
		System.out.print("enter your account balance: ");
		balance=sc.nextDouble();
		System.out.print("enter your email: ");
		email=sc.next();
		System.out.print("enter your account type: ");
		AccountType=sc.nextLine();
		
	}

	public void displayAccountDetails(){
		System.out.println(" your account number is :"+accountNo);
		System.out.println("your username is : "+username);
		System.out.println(" your email is : "+email);
		System.out.println(" your account type is : "+ AccountType);
		System.out.println(" your account balance is: "+ balance);
	}

	public static void main(String[] args) {
		Bank_Account user1=new Bank_Account();
		user1.getAccountdetails();
		user1.displayAccountDetails();
	}
}