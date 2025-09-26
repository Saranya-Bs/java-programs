package core_java_questions.libraries_1;
import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=(int)(Math.random()*(25)+1);
        System.out.println(n);
        for(int i=0;i<3;i++){
            System.out.println("Guess the number: ");
            int num=sc.nextInt();
            if(num==n){
                System.out.println("Your Guess is correct! The number is: "+num);
                sc.close();
                return;
            }
        }

        sc.close();

        System.out.println("You could not guess the number. It is: "+n);

        
    }
}
