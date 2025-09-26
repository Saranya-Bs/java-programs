package core_java_questions.basics;
import java.util.Scanner;
//import java_programms.Utils;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int temp=0;
        while(num>0){
            temp=temp*10+num%10;
            num/=10;
        }
        System.out.println("Number in reverse is: "+temp);

        sc.close();
    }
}
