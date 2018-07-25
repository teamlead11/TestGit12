package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		siddharthaStringReverse("Siddharthan Prabakaran");
	}

	public static void mymethod() {
		System.out.println("my method");
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
	
}
