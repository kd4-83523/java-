import java.util.Scanner;

public class assignment2 {
	public static void main(String []args) {
		double num1;
		double num2;
		double avg;
		System.out.println("enter 1st number");
		Scanner sc=new Scanner(System.in);
		
		//num1 =Sc.nextDouble();
		if(sc.hasNextDouble());
		{
			num1=sc.nextDouble();
			System.out.println("enter secound number");
			if(sc.hasNextDouble());
			{
				num2=sc.nextDouble();
				avg=(num1+num2)/2;
				System.out.println("avg is:"+avg);
				
			}
			else
			{
				System.out.println("num2 is not double");
			}
		}
		else
	}
	{
		System.out.println("num1 is not double");
	}
}