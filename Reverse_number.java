import java.util.Scanner;
public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Number in reverse is: "+Palindrome_numbers.Palindrome(n));

        sc.close();
    }
}
