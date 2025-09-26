package core_java_questions.basics;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 elements into the array: ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements in reverse order :");
        for(int i=4;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
