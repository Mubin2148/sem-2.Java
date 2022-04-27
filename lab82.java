import java.util.Scanner;

	class lab82{
	public static void main(String[] args) {
		int i=0,sum=0;
		Scanner sc=new Scanner(System.in);
		int[] n=new int[5];

			for(i=0;i<5;i++){

				 n[i]=sc.nextInt();
				}

		for(i=0;i<5;i++){

			
			try{
			if(n[i]<0){
			throw new Exception("pls enter +ve number");
			}

			else if(n[i]%10==0){
				throw new Exception("pls enter value that cannot be divisible by 10");
			}

			else if(n[i]>1000 && n[i]<2000){
				throw new Exception("don't enter between 1000-2000");
			}

			else if(n[i]>7000){
				throw new Exception("pls enter below 7000");
			}

			else {

			

				sum=sum+n[i];

				
			}
		}catch(Exception e){
			System.out.print(e);
		}
	}
	System.out.print("sum is :"+sum);
}
}