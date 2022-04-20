/*2. Write a program that illustrates interface inheritance. Interface A is extended by A1
and A2. Interface A12 inherits from both P1 and P2.Each interface declares one
constant and one method. Class B implements A12.Instantiate B and invoke each of
its methods. Each method displays one of the constants.*/


interface A{
	public void printA();
	final int a=27;
}
interface A1 extends A{
	public void printA1();
	final int b=1;
}
interface A2 extends A{
	public void printA2();
	final int c=3;
}
interface A12 extends A1,A2{
	public void printA12();
	final int d=4;
}
class B implements A12{
	public void printA(){
		System.out.println("A");
	}

	public void printA1(){
		System.out.println("A1");
	}

	public void printA2(){
		System.out.println("A2");
	}

	public void printA12(){
		System.out.println("A12");
	}

}
class lab_7_2{

	public static void main(String[] args) {
		
		B b1=new B();
		b1.printA();
		b1.printA1();
		b1.printA2();
		b1.printA12();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);
		System.out.println(b1.d);
	}
}
