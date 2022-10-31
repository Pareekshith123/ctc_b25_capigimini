package mmbankjavacoreproject;

public class Entry_point_of_mmbank {

	public static void main(String[] args) {
		mmfactory bankfactory=new mmfactory();
		 mmbanksavingsaccount SavingAcc=new  mmbanksavingsaccount(0, null, 0, false);
		 mmbankcurrentaccount CurrentAcc=new  mmbankcurrentaccount(0, null, 0, 0);
		 SavingAcc.withdraw();
		 SavingAcc.toString();
		 CurrentAcc.withdraw();
		 CurrentAcc.toString();
	}

}
