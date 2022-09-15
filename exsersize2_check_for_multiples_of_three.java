package first_project;
import java.util.*;

public class exsersize2_check_for_multiples_of_three {
	/*Write a Java program to check if a number is a multiple of 3 or otherwise.*/

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int g=sc.nextInt();
		if((g%3)==0) {
			System.out.println("The number you have entered is multiple of three");
			
		}
		else {
			System.out.println("The number you have entered is not a multiple of three");
			
		}

	}

}
