package mmbankjavacoreproject;

public abstract class Savingsaccount extends BankAccount {
	public Savingsaccount(int accNo, String accName, float accBal) {
		super(accNo, accName, accBal);
		// TODO Auto-generated constructor stub
	}
	private boolean isSalaried;
	private float MINBAL;
	public abstract float withdraw();
	public abstract String toString();
}
