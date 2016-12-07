import java.util.Scanner;

public class ACD_JAVAB2_Session_1_Assignment_1_Main {

	public static void main(String[] args) {
		// TODO First Assignment for Sum of two numbers without using + operator
		Scanner s=new Scanner(System.in);//Creating Object of Scanner
		System.out.println("Enter a: ");
		int a = s.nextInt();
		System.out.println("Enter b: ");
		int b = s.nextInt();
		int result =a-(-b);
		
		System.out.println("Result ="+result);
		s.close();
	}

}
 