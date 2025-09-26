package core_java_questions.oops_1;

class Products{
    String prod_name;
    double prod_price;

    public Products(String name,double price){
        this.prod_name=name;
        this.prod_price=price;
    }


    public void setPrice(double price){
        prod_price=price;
    }

    public double getNetPrice(){
        return prod_price;
    }

    public void print(){
        System.out.println("Product name: "+prod_name);
        System.out.println("Product price: "+prod_price);
    }

}

class ImportedProducts extends Products{
    double imp_duty=0;

    public ImportedProducts(String name,double price,double duty){
        super(name, price);
        this.imp_duty=duty;
    }

    public void setImportDuty(double duty){
        imp_duty=duty;
    }

    public double getNetPrice(){
        return prod_price+(prod_price*imp_duty/100);
    }
    
    public void print(){
        System.out.println("Price for the Imported product is : "+ getNetPrice());
    }
}

class DiscountedProducts extends Products{
    double discount_rate=0;

    public DiscountedProducts(String name,double price,double rate){
        super(name, price);
        this.discount_rate=rate;
    }

    public void setDiscountRate(double rate){
        discount_rate=rate;
    }

    public double getNetPrice(){
        return prod_price-(prod_price*discount_rate/100);
    }

    public void print(){
        System.out.println("Price after Discount is: "+getNetPrice());
    }
}

public class Q17 {
    public static void main(String[] args) {
        Products p=new ImportedProducts("watch", 1000, 2);
        
        if(p instanceof ImportedProducts imp){
            //ImportedProducts imp=(ImportedProducts)p;
            imp.setImportDuty(12);
        }
        p.print();

    }
    
}
