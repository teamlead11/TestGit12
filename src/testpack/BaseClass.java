package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		lohithaStringReverse();
		VetriStringReverse();


	}

	public static void lohithaStringReverse() {
		String input = "Welcome to Java";
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1 = input1.reverse();
        System.out.println(input1);
 
       
	
	}
	public static void VetriStringReverse() {
		
        System.out.println("Enter string to reverse:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }
}
