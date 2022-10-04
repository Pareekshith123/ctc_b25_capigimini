package trycatchexersize;

public class finallyBlockExample3 {

	public static void main(String[] args) {
		 int a = 20, b = 0; 
		 try 
		 { 
		   System.out.println("Value of a: " +a); 
		   System.out.println("Value of b: " +b); 
		   int div = a/b; 
		   System.out.println("Division: " +div); 
		  } 
		 catch(NullPointerException npe) 
		 { 
		   System.out.println(npe); // prints corresponding exception. 
		  } 
		 finally 
		 { 
		   System.out.println("Denominator cannot be zero"); 
		  } 
		 System.out.println("Hello Java"); 
		  


	}

}
