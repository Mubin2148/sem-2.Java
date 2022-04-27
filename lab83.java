import java.util.Scanner;

class lab83{

	public static void main(String[] args) {
		double balance=50000.08;
		String s1;
		System.out.print("enter withdraw or deposit");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();

		if(s1.equals("withdraw")){

			System.out.print("enter your withdraw amount :");

			int w=sc.nextInt();
			if(w<balance)
			balance=balance-w;
			

			else{
					try{
						throw new Exception("please enter valid balance:");
					}catch(Exception e){
					System.out.print(e);
					}

				}
			}

			if(s1.equals("deposit")){

				System.out.print("enter your deposit amount :");

				int d=sc.nextInt();
				balance=balance+d;
			}

			System.out.print("your updated balance is :"+balance);
		}
}