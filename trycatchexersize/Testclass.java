package trycatchexersize;
import java.util.Scanner;
public class Testclass {


		
			private static int age;
			static void validate() throws InvalidAgeException
			{ 
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter your age");
			 age = sc.nextInt();

			 if(age < 18)  
			 throw new InvalidAgeException("Invalid Age, You are not eligible to vote");  
			 else  
			 System.out.println("Welcome to vote");  
			}  
			public static void main(String[] args)
			{
			try
			{  
			 validate();  
			}
			catch(Exception e)
			{
			  System.out.println("Caught an Exception: \n "+e);
			 }   
			   
			
			}

	

}
