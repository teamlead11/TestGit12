package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		nithyaStringReverse();

		lohithaStringReverse();

		siddharthaStringReverse("Siddharthan Prabakaran");
		VetriStringReverse();


	}

	public static void lohithaStringReverse() {
		String input = "Welcome to Java";
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1 = input1.reverse();
        System.out.println(input1);
 
       
	
	}
	public static void nithyaStringReverse() {
	String string = "abcdef";
    String reverse = new StringBuffer(string).reverse().toString();
    System.out.println("\nString before reverse: "+string);
    System.out.println("String after reverse: "+reverse);
 }

	
	public static void siddharthaStringReverse(String a)
	{

		int i = a.length();
		int j;
		
		char[] reverseArray = new char[i];
		
		for(i= i-1,j=0; i>=0; i--,j++)
		{
			reverseArray[j] = a.charAt(i);	
		}
		
		System.out.println(reverseArray);
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
