package core_java_questions.libraries_1;
import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks: ");
        String str=sc.nextLine();
        String[] arr=str.split(",");
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=Integer.parseInt(arr[i]);
        }
        System.out.println("The total is: "+total);

        sc.close();

    }
}
