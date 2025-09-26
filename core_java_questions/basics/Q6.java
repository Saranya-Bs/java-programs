package core_java_questions.basics;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        sc.close();
        for(int i=n-1;i>0;i--){
            if(n%i==0){
                System.out.println("Highest Factor is "+i);
                break;
            }
        }
    }
}
