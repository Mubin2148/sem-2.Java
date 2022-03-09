import java.util.Scanner;
class cel{
	 static void celcius(float f){
		
		double c=f-(32*(5.0/9.0));
		System.out.print("temperature in celicus is :"+c);
	}
	public static void main(String[] args) {
		System.out.print("enter temperature in fehrenheit :");
		Scanner sc=new Scanner(System.in);
		float f=sc.nextInt();
		celcius(f);
		
	}
}