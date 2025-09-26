package core_java_questions.basics;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=sc.nextInt();
        }
        sc.close();
        System.out.println("Average is :"+(sum/5));
    }
}
