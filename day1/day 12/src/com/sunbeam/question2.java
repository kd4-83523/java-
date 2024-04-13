package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class question2{

	public static void main(String[] args) {

		Student arr[] = new Student[5];
		arr[0] = new Student(2, "atharva", "mangalwedha", 89.59);
		arr[1] = new Student(3, "shrutika", "sangali", 99.59);
		arr[2] = new Student(5, "akshada", "pandhrpur", 79.59);
		arr[3] = new Student(1, "shreyansh", "kolhapur", 22.59);
		arr[4] = new Student(4, "jaid", "gadchirli", 55.59);
	}

	int choice do
	{
	System.out.println("0.exit");
	System.out.println("1.sorted on city(asc)");
	System.out.println("2.sorted on marks");
	System.out.println("3.sorted on names(asc)");

	Object[] sarr;
	switch (choice)
	{
	case 0:
		System.out.println("thank for using app");
		break;
	case 1:
		class StudentnameComparator implements Comparator<Student>{
			public int comapre(Student o1,Student o2) {
				int value=o1.getCity().compareTo(o2.getCity());
				return value;
			}

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		}
		break;
	case 2:
		class StudentMarksComparator implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {
				int value = Double.compare(o2.getMarks(),o1.getMarks());
				return value;
			}
				
		Comparator <Student> StudentnameComparator =new StudentnameComparator();
		Arrays.sort(sarr);
		for ( Object s :sarr)
			System.out.println(s+"");	
		
		break;
	case 3:

		class StudentSNameComparator implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {
				int value = o1.getName().compareTo(o2.getName());
				return value;
			}
			
			
		}
		
		 Comparator<Student> studentSNameComparator = new StudentSNameComparator();
		
		
		Arrays.sort(sarr, studentSNameComparator);
		for(Student S : sarr) {
			System.out.print(s + " ");
		}
		
		break;

	default:
		System.out.println("you entered wrong choice");
		break;
	}
	}
}
	}
}
