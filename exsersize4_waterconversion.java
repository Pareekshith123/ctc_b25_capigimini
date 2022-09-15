package first_project;
import java.util.*;

public class exsersize4_waterconversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount of water consumed in galons");
		int d=sc.nextInt();
		if(d<=45){
			System.out.println("No tax");
			
		}
		else if(d<75&&d>45){
			
			System.out.println("tax==475");	
			
		}
        else if(d<125&&d>75){
			
			System.out.println("tax==750");	
			
		}
         else if(d<200&&d>125){
			
			System.out.println("tax==1225");	
			
		}
         else if(d<350&&d>200){
 			
 			System.out.println("tax==1650");	
 			
 		} else {
			
			System.out.println("tax==2000");	
			
		}

	}

}
