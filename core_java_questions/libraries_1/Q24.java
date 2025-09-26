package core_java_questions.libraries_1;

import java.util.Objects;

class Overriding{
    String name;

    public Overriding(String name){
        this.name=name;
    }

    
    public String toString(){
        return "Name is: "+name;
    }


    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        Overriding obj2=(Overriding)obj;

        return this.name==obj2.name;
    }


    public int hashCode(){
        return Objects.hash(name);
    }
}

public class Q24 {
    public static void main(String[] args) {
        Overriding obj=new Overriding("Bob");
        System.out.println(obj);

        System.out.println(obj.equals(obj));
        Overriding obj2=new Overriding("Bobby");
        System.out.println(obj.equals(obj2));

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

    }
    
}
