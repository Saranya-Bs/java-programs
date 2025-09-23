import java.util.Scanner;
public class Largest_Number {
    public static void main(String[] args) {
        int val=Integer.MIN_VALUE;
        System.out.println("Enter 10 numbers");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            int num=sc.nextInt();
            if(num>val)
            val=num;
        }
        System.out.println("Largest Number is: "+val);
    }
}
