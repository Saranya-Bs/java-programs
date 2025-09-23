import java.util.Scanner;
public class ArrayInterchange {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 elements: ");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            int temp=arr[i];
            arr[i]=arr[i+5];
            arr[i+5]=temp;
        }
        System.out.println("Array after interchanging is: ");
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
