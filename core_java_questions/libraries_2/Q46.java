package core_java_questions.libraries_2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Q46 {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        String str;
        TreeSet<String> ts=new TreeSet<>();

        System.out.println("Enter a string: ");

        Pattern p=Pattern.compile("[a-zA-z]+[0-9]+");

        PrintWriter pw=new PrintWriter(new FileWriter("regex.txt"));


        while(!(str=sc.nextLine()).equalsIgnoreCase("END")){
            if(p.matcher(str).matches()){
            ts.add(str);
            }
        
        }

        for(String s:ts){
            pw.println(s);
        }

        sc.close();
        pw.close();
    }
        
}
