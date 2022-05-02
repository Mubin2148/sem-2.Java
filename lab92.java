class Runnable1 implements Runnable{
	public void run(){

		for(int i=0;i<21;i+=2){

			System.out.println("Number is even :"+i);
			try{
				Thread.sleep(500);
			}
			catch(Exception e){

			}
		}
	}
}

class Runnable2 implements Runnable{
	public void run(){

		for(int j=1;j<21;j+=2){
			System.out.println("Number is odd :"+j);
			try{
				Thread.sleep(500);
			}
			catch(Exception e){

			}
		}
	}
}

class lab92{
public static void main(String[] args) {

	
	Runnable1 r1=new Runnable1();
	Runnable2 r2=new Runnable2();
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();
	

	

}
}