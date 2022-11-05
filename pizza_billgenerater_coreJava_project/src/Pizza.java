public class Pizza {
    private int price;
    public boolean veg;
    private  int extraCheesePrice=100;
    private  int extraToppingsPrice=150;
    private int bagpackPrice=20;
    private int basePizzaPrice;
    private boolean isExtracheeseadded=false;
    private boolean isExtraToppingsadded=false;
    private boolean isoptedtotakeaway=false;
    public Pizza(boolean veg){
        this.veg=veg;
        if( this.veg){
            this.price=300;

        }else{
            this.price=400;
        }
    }
    public void getPizzaPrice(){
        System.out.print(this.price);
    }
    public void addExtraCheese(){
        isExtracheeseadded=true;
        System.out.println("Extra cheese added");
        this.price+=extraCheesePrice;

    }
    public  void addExtraToppings(){
        isExtraToppingsadded=true;
        System.out.println("Extra Toppings added");
        this.price+=extraToppingsPrice;
    }
     public void takeaway(){
        isoptedtotakeaway=true;
         System.out.println("Take away opted");
         this.price+=bagpackPrice;

    }
    public void getbill(){
        String bill="";
System.out.println("price:"+basePizzaPrice);
if (isExtracheeseadded){
    bill +="Extra chese added:"+extraCheesePrice+"\n";

}
if (isExtraToppingsadded){
    bill+="Extra Toppings added:"+extraToppingsPrice+"\n";
}

if (isoptedtotakeaway){
    bill+="Take away:"+bagpackPrice+"\n";
        }
bill +="Bill:"+this.price+"\n";
System.out.println(bill);
    }
}
