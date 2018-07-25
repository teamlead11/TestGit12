package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		VetriStringReverse();

	}

	public static void mymethod() {
		System.out.println("my method");
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
