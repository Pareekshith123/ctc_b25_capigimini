package first_project;

public class exsersize8_ {

	public static void main(String[] args) {
		int k=1;
		int a []= {1,2,3,6,9,-9,-8,-56,-89,9};
         for(int i=0;i<=9;i++){
        	 if(a[i]<0){
        		 k *=a[i];
        	 }
         }
         System.out.println("the product of negative numbers is"+k);
	}

}
