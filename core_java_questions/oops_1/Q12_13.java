package core_java_questions.oops_1;

class Product{
    int prod_id;
    String prod_name;
    int price;
    int quantity_on_hand;

    public Product(){
        this.prod_id=0;
        this.prod_name=null;
        this.price=0;
        this.quantity_on_hand=0;
    }

    public Product(int prod_id){
        this.prod_id=prod_id;
    }

    public Product(int prod_id,int price){
        this.prod_id=prod_id;
        this.price=price;
        this.quantity_on_hand=0;
    }


    public void init(int prod_id,String prod_name,int price){
        this.prod_id=prod_id;
        this.prod_name=prod_name;
        this.price=price;
        this.quantity_on_hand=0;

    }

    public double getNetPrice(){
        return (price+(price*0.12));
    }

    public void purchase(int qty){
        quantity_on_hand=quantity_on_hand+qty;
        
    }

    public void sell(int qty){
        if(quantity_on_hand<=0){
            System.out.println("Not enough Products!");
            return;
        }
        quantity_on_hand=quantity_on_hand-qty;
        
    }

    public void display_qty(){
        System.out.println("Quantity on hand is: "+quantity_on_hand);
    }
    
}
public class Q12_13 {
    public static void main(String[] args) {
        Product p=new Product();
        p.purchase(5);
        p.sell(3);
        p.display_qty();
    }
}
