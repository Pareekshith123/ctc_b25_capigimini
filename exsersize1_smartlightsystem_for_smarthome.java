package first_project;
import java.util.*;

public class exsersize1_smartlightsystem_for_smarthome {
	/*Write a Java program that checks the time (given in a 24 Hour format) and turns
	on the light switches in a smart home (program has to display lights on or lights
	//off)*/
	public static void main(String[] args) {
		System.out.println("enter the time in 24 hour format as hours.minutes for example 14,36");
		Scanner sc =new Scanner(System.in);
		double d=sc.nextDouble();
		if(d<=13.00&d<18.00) {
		
		    System.out.println("lights off");
		}
		if(d>=18.00&d<23.00) {
			
			System.out.println("lights on");
			}
		if(d<=23.00&d<12.00) {
				
			System.out.println("lights off");
	
		
		}
		else {
			
			System.out.println("lights off");
		}
	}
	
}

