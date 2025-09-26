package core_java_questions.libraries_1;
import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        String ans="";
        for(char c:str.toCharArray()){
            if(Character.isUpperCase(c)){
                ans+=Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                ans+=Character.toUpperCase(c);
            }
            else{
                ans+=c;
            }
        }
        System.out.println("String with reversed case is: "+ans);

        sc.close();
    }
}
