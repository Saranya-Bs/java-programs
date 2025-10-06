package core_java_questions.oops_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int ans=0;
        for(int i=0;i<5;i++){
            try{
                ans+=sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Not a valid Integer!!");
                sc.next();
            }
            
        }
        sc.close();
        System.out.println("Sum is: "+ans);

    }
}
