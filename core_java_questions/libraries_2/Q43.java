package core_java_questions.libraries_2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Q43 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter pan number: ");

        String pan=sc.nextLine();

        Pattern p=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");

        if(p.matcher(pan).matches()){
            System.out.println("Valid PAN ");
        }
        else{
            System.out.println("Invalid PAN ");
        }

        sc.close();
    }
}
