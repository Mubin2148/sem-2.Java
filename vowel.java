import java.util.Scanner;
class vowel{
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.print("enter your string:");
	String s1=sc.nextLine();
	String s2=s1.toLowerCase();
	int l=s2.length();
	int i=0,v=0,c=0;
	String quit="quit";
	char ch=0;
	if(s2.equals(quit))
	{
		System.out.print("this program is terminated .");
	}
	else{
	for(i=0;i<l;i++)
	{
		 ch=s2.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			v++;
		}
		else
		{
			c++;
		}
		System.out.println(v+" vowels");
	System.out.print(c+" consonents");

	}
}
	
	
	
	}
}