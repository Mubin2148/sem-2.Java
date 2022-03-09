import java.util.Scanner;
class avg{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double x[]=new double[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("enter your number:");
			 x[i]=sc.nextDouble();
		}
		double sum=x[0]+x[1]+x[2]+x[3]+x[4];
		double avg=sum/5;
		System.out.print("average is: "+avg);
	}
}