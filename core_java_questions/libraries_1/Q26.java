package core_java_questions.libraries_1;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        DateTimeFormatter form=DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Enter the starting date in DD-MM-YYYY format: ");
        String str=sc.nextLine();

        LocalDate starting_date=LocalDate.parse(str,form);

        System.out.println("Enter the ending date in DD-MM-YYYY format: ");
        String str2=sc.nextLine();

        LocalDate ending_date=LocalDate.parse(str2,form);

        long days=ChronoUnit.DAYS.between(starting_date, ending_date);
        System.out.println("The number of days in between is: "+days);

        sc.close();
    }
}
