package core_java_questions.libraries_2;

import java.util.Scanner;



public class Q32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        String st;
        int ans=0;
        while(!(st=sc.nextLine()).equals("O")){
            int num=Integer.parseInt(st);
            ans+=num;
        }
        System.out.println("Sum is: "+ans);
        sc.close();
    }
}
