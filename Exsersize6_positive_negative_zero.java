package first_project;
import java.util.*;
public class Exsersize6_positive_negative_zero {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int p=sc.nextInt();
		
		
		if(p>0){
			System.out.println("The number you entered is positive ");
		}		
		if(p<0){
			System.out.println("The number you entered is negative ");
		}
		if(p==0){
			System.out.println("The number you entered is Zero");
		}
	}

}
