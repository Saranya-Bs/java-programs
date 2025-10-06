package core_java_questions.libraries_2;

import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line: ");
        String line=sc.nextLine();

        for(String s:line.split("\\s")){
            System.out.println(s);
        }

        sc.close();
    }
}
