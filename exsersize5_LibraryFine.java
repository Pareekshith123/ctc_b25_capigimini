package first_project;
import java.util.*;
public class exsersize5_LibraryFine {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of days");
		int ffr=sc.nextInt();
		int fine;
		if(ffr<=5){
			fine=ffr*1;
		}else if(ffr<=10){
		      fine=(5*1)+(ffr-5)*5;
			
		}else {
			fine=(5*1)+(5*5)+(ffr-10)*10;
		}
		System.out.println("please deliver the on time and fine for this time is"+fine);
	}

}
