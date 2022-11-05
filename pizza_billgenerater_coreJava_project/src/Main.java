public class Main {

    public static void main(String[] args) {
Pizza basePizza=new Pizza(false);
DeluxPizza dp=new DeluxPizza(false);
System.out.println("----------------------------------------------");


basePizza.takeaway();
basePizza.getbill();
dp.getbill();
System.out.println("----------------------------------------------");

    }
}
