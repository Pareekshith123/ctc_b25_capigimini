package first_project;
import java.util.*;
public class exsersize3_maximumofthreenumbers {

	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   int a=sc.nextInt();
	   int b=sc.nextInt();
       int c=sc.nextInt();
       if(a>b){
    	   System.out.println("A is greater");  
       }
       
       else if(b>c){
    	   System.out.println(" B is greater");
       
       }
       else if(c>a) {
    	   System.out.println(" C is greater");
    	   
       }
       else {
    	   
    	  System.out.println(" all the numbers are same and equal");
       }
       
       
       
	}

}
