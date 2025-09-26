package core_java_questions.basics;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        int day,hours;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day from 1-7 and the number of hours(1-24) worked:");
        day=sc.nextInt();
        if(day<1 || day>7){
            System.out.println("Enter valid day");
            sc.close();
            return;
        }
        hours=sc.nextInt();
        
        if(hours<=0 || hours>24){
            System.out.println("Enter valid number of hours");
            sc.close();
            return;
        }
        int wage= switch(day){
            case 1,2,3->200*hours;
            case 4,5->400*hours;
            case 6->600*hours;
            case 7->800*hours;
            default->0;
        };
        if(wage>2000){
            wage+=wage*0.1;
        }
        System.out.println("Your wage is :"+wage);

        sc.close();
        
    }
}
