// Write a program to create two threads, one thread will print odd 
// numbers and second thread will print even numbers between 1 to 20 
// numbers.
class One implements Runnable{
    public void run(){
        int sum=0;
        for(int i=1;i<=100;i++){
            sum=sum+i;
            System.out.println(sum);
        }
    }
}
class Two implements Runnable{
    public void run(){
        int sum=0;
        for(int i=102;i<=200;i++){
            sum=sum+i;
            System.out.println(sum);
        }
    }
}
public class Ex_9_2{
    public static void main(String[] args)throws Exception {
        
    }
}

