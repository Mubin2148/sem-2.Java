interface Transport{
	public void deliver();
}

abstract class Animal{

}

 class Tiger extends Animal {

}

 class Camel extends Animal implements Transport{

	public void deliver(){
		System.out.print("deliver method invoked");
	}

}
 class Deer extends Animal{

}

 class Donkey extends Animal implements Transport{

}

public class lab63{
 	public static void main(String[] args) {
 		Animal[] a=new Animal[4];
 		a[0]=new Donkey();
 		a[1]=new Deer();
 		a[2]=new Camel();
 		a[3]=new tiger();

 		a[0].deliver();

 	}
 }