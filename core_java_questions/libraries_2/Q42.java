package core_java_questions.libraries_2;

import java.util.TreeSet;

public class Q42 {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>((a,b)->a.length()-b.length());
        ts.add("ALice");
        ts.add("bob");
        ts.add("Mary");
        ts.add("B");

        System.out.println(ts);
    }
}
