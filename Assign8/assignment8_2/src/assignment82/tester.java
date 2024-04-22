package assignment82;

import java.util.Comparator;
import java.util.Scanner;



public class tester 
{
    public static <T> void sort(T[] arr,Comparator<? super T>c) 
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    			if(c.compare(arr[i], arr[j])>0)
    			{
    				T temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    	}
	  	
	}
	public static void main(String[] args) 
	{

		int choice;
		Scanner sc= new Scanner(System.in);
		student s[]=new student[5];
		s[0]=new student(2,"sonya","Kolhapur",40);
		s[1]=new student(1,"Aba","Kadegaon",80);
		s[2]=new student(4,"Shachin","Shegaon",70);
		s[3]=new student(5,"Ashish","Manevasti",50);
		s[4]=new student(3,"rohit sharma","mumbai",90);
		
		class sortrollnowi implements Comparator<student>
		{

			@Override
			public int compare(student o1, student o2) 
			{
			  return o1.getRoll()-o2.getRoll();
			}
			
		}
		
		 System.out.println("Before sorting :");
		
		 for(student s1:s)
		 {
			 System.out.println(s1);
		 }
		
		  
		 tester.<student>sort(s, new sortrollnowi());
	
		 
		 System.out.println("after sorting :");
		 for(student s1:s)
		 {
			 System.out.println(s1);
		 }
	}

}
