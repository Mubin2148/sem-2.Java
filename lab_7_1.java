 /*1. The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato.
Write a java program that demonstrates how to establish this class hierarchy. Declare
one instance variable of type String that indicates the color of a vegetable. Crete and
display instances of these objects. Override the toString() method of object to return a
string with the name of vegetable and its color.*/


abstract class Vegetable{
	public abstract String toString();
}

 class Potato extends Vegetable{

	public String toString(){
		String pot="potato-yellow";
		return pot; 
	}
}

 class Brinjal extends Vegetable{

	public String toString(){
		String bri= "brinjal-purple";
		return bri;
	}
}

 class Tomato extends Vegetable{

	public String toString(){
		String tom= "tomato-red";
		return tom;
	}
}

public class lab_7_1{

	public static void main(String[] args) {
		Vegetable v1=new Potato();
		Vegetable v2= new Brinjal();
		Vegetable v3= new Tomato();

		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
	}
}