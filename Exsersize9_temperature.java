package first_project;
import java.util.*;
public class Exsersize9_temperature {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter initial temperature");
	int temp=sc.nextInt();
	for(int i=1;i<7;i++){
		temp=temp-2;
       System.out.println(temp);		
	}

	}

}
