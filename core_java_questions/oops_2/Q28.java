package core_java_questions.oops_2;

import java.util.ArrayList;
import java.util.Comparator;

class Products{
    String name;
    double price;
   // public Products(){}
    public Products(String name,double price){
        this.name=name;
        this.price=price;
    }

    public String toString() {
    return "Product{name='" + name + "', price=" + price + "}";
}
}


class CompareName{
    //public CompareName(){super();}
    public static void ComparebyName(ArrayList<Products> li){
        li.sort(Comparator.comparing(l->l.name));
        li.forEach(System.out::println);
    }
}

class ComparePrice{
    public static void ComparebyPrice(ArrayList<Products> li){
        li.sort(Comparator.comparing(l->l.price));
        System.out.println(li);
    }
}

public class Q28 {
    public static void main(String[] args) {
        ArrayList<Products> li=new ArrayList<>();
        li.add(new Products("watch",1200));
        li.add(new Products("tv",1500));


        CompareName.ComparebyName(li);
        ComparePrice.ComparebyPrice(li);

    }
}

