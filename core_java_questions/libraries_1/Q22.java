package core_java_questions.libraries_1;
import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();

        sc.close();
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                System.out.println("Space at: "+(i+1));
                return;
            }
        }
        System.out.println("No spaces are present in the given string");

        

    }
}
