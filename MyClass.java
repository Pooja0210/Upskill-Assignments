//first program in java
public class MyClass {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
	}
}
// Using Variables
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNumber;
		myNumber = 88;
		short myShort = 847;
		long myLong = 9797;
		double myDouble =324.5f;
		char myChar = 'p';
		boolean myBoolean = false;
		byte myByte = 127;
		
		
		System.out.println(myNumber);
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myChar);
		System.out.println(myBoolean);
		System.out.println(myByte);
	}
}

// Strings- Working with text

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt = 7;
		
		String text = "Hello";
		String blank = " ";
		String name = "Pooja";
		String greeting = text + blank + name;
		System.out.println(greeting);
		double myDouble = 7.8;
		System.out.println("Pooja" + " " + "GoodMrng");
		System.out.println("My Integer is: " +myInt);
		System.out.println("My number is: " +myDouble +".");
	}
}
//For loop
public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5 ; i++) {
			System.out.println("Hello " +i);
		}
		for(int j=0; j<5 ; j++) {
			System.out.printf("The value of j is %d\n", j); 
		}
	}
}

//While loop
public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean loop = true;
		System.out.println(loop);
		int value = 0;
		while(value < 10)
		{
			System.out.println("Hello " + value);
			
			value = value + 1;
		}
	}
}

// User Input 
import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("User Input :");
		String line = input.nextLine();
		int value = input.nextInt(); 
		System.out.println("User input " + line);
		System.out.println("User IntInput " + value);
	}
}



