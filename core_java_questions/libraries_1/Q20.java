package core_java_questions.libraries_1;
import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        System.out.println("You entered: ");
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }

        sc.close();
    }
}
