import java.util.Scanner;
class circle{
		 static void circleArea(float r){
		 	double sum=(Math.PI)*r*r;
		 	System.out.print("Area is :"+sum);
		 }
	 	public static void main(String[] args){
		System.out.print("enter the radius of the circle :");
		Scanner sc=new Scanner(System.in);
		float r=sc.nextInt();
		circle.circleArea(r);
		
}
}