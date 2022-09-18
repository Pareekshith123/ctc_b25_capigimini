package first_project;

public class State {
	
	public void pState(){
	
		System.out.println(" welcome to karnataka");
	}
}
class city extends State {
	
	public void dcity() {
		
		System.out.println("welcome to bangalore ");
	}
	
}
class district extends city{
	public void pdistrict() {
	System.out.println("welcome to bengaluru rural district");
	}
	
	public static void main(String[] args) {
		district ssc=new district();
		ssc.pState();
		ssc.dcity();
		ssc.pdistrict();
	}
	
	
	
}