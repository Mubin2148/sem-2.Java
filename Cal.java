import java.util.Scanner;
class Cal{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;

		System.out.println("enter a=");
		int a=sc.nextInt();
		System.out.println("enter string=");
		String s=sc.next();
		System.out.println("enter b=");
		int b=sc.nextInt();
		
		if(s.equals("add")){
			 sum=a+b;
		}
		else if(s.equals("substract")){
			 sum=a-b;
		}
		else if(s.equals("multi")){
			 sum=a*b;
		}
		else if(s.equals("division")){
			 sum=a/b;
		}

		System.out.print("answer is: "+sum);

	}
}
