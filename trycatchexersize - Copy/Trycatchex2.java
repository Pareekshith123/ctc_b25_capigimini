package trycatchexersize;

public class Trycatchex2 {

	public static void main(String[] args) {
		System.out.println("111"); 
		 try 
		 { 
		   int x = 12/0; 
		   System.out.println("Result of x: " +x);  
		   System.out.println("333"); 
		 } 
		 catch(ArithmeticException ae) 
		 { 
		   System.out.println("Hello world"); 
		 } 
		 System.out.println("444"); 
		 } 
		


	}


