package mmbankjavacoreproject;

public abstract class BankAccount {
	
	private int accNo;
	private String accNm;
	private float accBal;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accNm;
	}
	public void setAccName(String accName) {
		this.accNm = accName;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

public  BankAccount(int accNo,String accName,float accBal) {

}
public void withdraw(float withdraw) {
	if(this.getAccBal()-withdraw<0) {
		System.out.println("withdraw successful,balance is"+ this.getAccBal());
	}else {
		this.setAccBal(this.getAccBal() - withdraw);
		System.out.println("withdraw successful,current balance is"+this.getAccBal());
	}
}

@Override
public String toString(){//overriding the toString() method  
	  return accBal+" "+accNm+" "+accBal;  
	 }  

}