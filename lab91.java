class Runnable1 implements Runnable{
	public void run(){

		for(;;){
			System.out.println("good Morning");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){

			}
		}
	}
}


class Runnable2 implements Runnable{
	public void run(){

		for(;;){
			System.out.println("good afternoon");
			try{
				Thread.sleep(3000);
			}
			catch(Exception e){

			}
		}
	}
}

class lab91{
public static void main(String[] args) {

	
	Runnable1 r1=new Runnable1();
	Runnable2 r2=new Runnable2();
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();

	

}
}