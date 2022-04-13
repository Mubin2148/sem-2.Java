import java.io.*;
import java.util.*;
class student
{
	int id_no;
	int no_of_subjects;
	int[] subject_code=new int[10];
	int[] subject_credit=new int[10];
	int[] grade_obtained=new int[10];
	double spi;
	student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id no : ");
		  id_no=sc.nextInt();
		System.out.println("Enter no of subject : ");
		 no_of_subjects=sc.nextInt();
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter subject code : ");
			subject_code[i]=sc.nextInt();
			System.out.println("Enter subject credit : ");
			subject_credit[i]=sc.nextInt();
			System.out.println("Enter grade obtained : ");
			grade_obtained[i]=sc.nextInt();
		}
	}
	double calculate_spi()
	{
		int temp=0,tcredit=0;
		for(int i=0;i<no_of_subjects;i++)
		{
			temp=temp+(subject_credit[i]*grade_obtained[i]);
			tcredit=tcredit+subject_credit[i];
		}
		spi=temp/tcredit;
		return spi;
	}
	void display()
	{
		System.out.println("id_no :"+id_no);
		System.out.println("no_of_subjects :"+no_of_subjects);
		for(int i=0;i<no_of_subjects;i++)
		{
			System.out.println("subject_code :"+subject_code[i]);
			System.out.println("subject_credits :"+subject_credit[i]);
			System.out.println("grade_obtained :"+grade_obtained[i]);
		}
		System.out.println("spi : "+spi);
	}
}
public class lab61
{
	public static void main(String[] args)
	{
		student s1=new student();
		s1.spi=s1.calculate_spi();
		s1.display();
	}
}