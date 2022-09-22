package Amazon;

public class Prime implements Accounts {

	@Override
	public void deliverycharge() {
		System.out.println("There will be no  deliverycharges for prime users");
		
	}

	public static void main(String[] args) 
	{
	
		 Prime s=new Prime();
		 Non_prime P=new Non_prime();
			P.deliverycharge();
		s.deliverycharge();
		//System.out.println("end");
		
		
	}
	
	
	
	
	
	
}
