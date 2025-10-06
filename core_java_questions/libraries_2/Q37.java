package core_java_questions.libraries_2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter pw=new PrintWriter("marks.txt");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 20 marks: ");
        for(int i=0;i<20;i++){
            int m=sc.nextInt();
            pw.println(m);
        }
        pw.close();
        sc.close();
    }
}
