package core_java_questions.libraries_2;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

class Circle{
    double x;
    double y;

    public Circle(double x,double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(!(obj instanceof Circle)) return false;
        Circle obj1=(Circle)obj;
        if(this.x==obj1.x && this.y==obj1.y)return true;
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(x,y);
    }

    public String toString(){
        return "Circle parameters: x-"+x+" ,y- "+y;
    }
}



public class Q41 {
    public static void main(String[] args) {
        HashSet<Circle> hs=new HashSet<>();
        TreeSet<Circle> ts=new TreeSet<>((a,b)->Double.compare(a.x, b.x));

        hs.add(new Circle(1,2));
        hs.add(new Circle(1, 2));
        hs.add(new Circle(3,4));

        ts.add(new Circle(3, 2));
        ts.add(new Circle(1, 2));
        ts.add(new Circle(1, 2));
        

        System.out.println(hs);
        System.out.println(hs.size());

        System.out.println(ts);
        System.out.println(ts.size());

    }
}
