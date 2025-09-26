import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base and the power");
        double a=sc.nextDouble();
        double m=sc.nextDouble();
        System.out.println(Math.pow(a, m));

        sc.close();
    }
}
