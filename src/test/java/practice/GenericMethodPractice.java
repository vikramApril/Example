package practice;

public class GenericMethodPractice {
	
	public static void main(String[] args) { //Caller function
		
		int sum = add(90,20); // a=30, b=20
		System.out.println(sum);
		
	}
	
	public static int add(int a, int b) //called function - Generic method
	{
		int c = a+b;
		return c;
	}

}
