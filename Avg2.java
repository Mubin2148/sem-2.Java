import java.util.Scanner;
public class Avg2{
	public static void main(String[]args){
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter array");
		int a[]=new int[4];
		for(int i=0;i<4;i++)
		{
			a[i]=input.nextInt();
			sum=sum+a[i];

		}
		int avg=sum/4;
		System.out.println("average"+avg);
	}
}

