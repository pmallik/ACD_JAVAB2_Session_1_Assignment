
public class ACD_JAVAB2_Session_1_Assignment_3_Main {

	public static void main(String[] args) {
		// TODO swap 2 numbers without using 3rd variable
		
		int a = 20;
        int b = 40;
        System.out.println("Before swap:");
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap:");
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);


	}

}
