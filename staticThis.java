import java.util.Scanner;
class staticThis{
	static int count=0;
	staticThis(int count){
		this.count=count;
	}
	public void print(){
		System.out.println("the new number is :"count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int count=sc.nextInt();
		staticThis ms=new staticThis(count);
		ms.print();
	}
}
