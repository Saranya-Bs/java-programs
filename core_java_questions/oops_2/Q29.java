package core_java_questions.oops_2;
import java.util.Scanner;
public class Q29 {
    public static void main(String[] args) {
        System.out.println("Enter five numbers as strings:");
        int ans=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            String s=sc.nextLine();
            ans+=Integer.parseInt(s);

        }
        System.out.println("Total is: "+ans);

        sc.close();
    }
}
