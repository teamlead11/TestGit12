package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lohithaStringReverse();
	}

	public static void lohithaStringReverse() {
		String input = "Welcome to Java";
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1 = input1.reverse();
        System.out.println(input1);
 
       
	
	}
}
