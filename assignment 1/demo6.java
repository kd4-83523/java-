import java.util.Scanner;

public class demo6 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		
		{
			Scanner sc = new Scanner(System.in);
			int num1;
			System.out.println("enter a number");
			num1=sc.nextInt();
			System.out.println("given number "+num1);
			System.out.println("for binary number"+Integer.toBinaryString( num1));
			System.out.println("for binary number"+Integer.toHexString( num1));
			System.out.println("for binary number"+Integer.	toOctalString(( num1)));
			System.out.println("thanks.......");
			//toBinaryString(int i)
			
			
			
			
		}
	}

}