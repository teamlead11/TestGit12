package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		rajan();
		nishaReverseString();
		nithyaStringReverse();
		lohithaStringReverse();
		bhavithaStringReverse();
		siddharthaStringReverse("Siddharthan Prabakaran");
		VetriStringReverse();
		
		System.out.println("Check");


		MeenaStringReversal();
		pradeepaReverseString();
		aarthiStringReverse();
		amudhanReverseString();
		lydiaReverseString();
	}

	public static void lohithaStringReverse() {
		String input = "Welcome to Java";
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1 = input1.reverse();
        System.out.println(input1);
	}
	
	public static void bhavithaStringReverse() {
		String string = "bhavitha";
	    String reverse = new StringBuffer(string).reverse().toString();
	    System.out.println("\nString before reverse: "+string);
	    System.out.println("String after reverse: "+reverse);
	}
	
	
	public static void nithyaStringReverse() {
	String string = "abcdefgh";
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
	
	public static void rajan() {
		
	   String s1="rajanstring";
	   
	   int length=s1.length();
	   String s2="";
	   for(int i=length-1;i>=0;i--) {
		   s2=s2+s1.charAt(i);
		  
	   }
	   System.out.println(s2);
 	}
	
   

	public static void MeenaStringReversal(){
					
			String name = "Akshay";
			
			int size = name.length();
			System.out.println("Total size is " + size);
			int i = 4;
				 while(i<5 && i!=-1){
					 System.out.print(name.charAt(i));
					 i--;
				 }
			  
			}
	

	public static void pradeepaReverseString()
	{
		System.out.println("Enter the String to Reverse:");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
	    int l=s1.length();
	    String s2="";
	    for(int i=l-1;i>=0;i--) {
		s2=s2+s1.charAt(i);
	    }
	    System.out.println(s2);
	}

	public static void aarthiStringReverse() {
			System.out.println("Enter string to reverse:");
			
			Scanner read = new Scanner(System.in);
			String str = read.nextLine();
			
			StringBuilder sb = new StringBuilder(str);
			
			System.out.println("Reversed:");
			System.out.println(sb.reverse().toString());
			}

	public static void amudhanReverseString() {
		String s = "amudhan";
	    String r = new StringBuffer(s).reverse().toString();
	    System.out.println("Before: "+s);
	    System.out.println("After: "+r);
	}


public static void nishaReverseString(){
	 
			String s2="";
			Scanner input=new Scanner(System.in);
			String s1 = input.next();
			for(int i=s1.length()-1;i>=0;i--){
				s2=s2+s1.charAt(i);
				
			}
			System.out.println(s2);
			
}
		


	
	public static void lydiaReverseString()
	{
           String str="Welcome";
           String reverse="";
           for ( int i=str.length()-1;i>=0;i--) {
	       char c = str.charAt(i);
	       reverse=reverse+c;
           }
	           System.out.println(reverse);	
	}
}

	

	


