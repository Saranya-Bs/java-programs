package core_java_questions.basics;

import java.util.Scanner;

public class Q10 {


    public static void commonfacts(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        boolean flag=true;

        for(int i=2;i<=min;i++){
            for(int n:arr){
                if(n%i!=0){
                    flag=false;
                }
            }
            if(flag==true){
            System.out.println(i);
        }
        }
        

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        commonfacts(arr);
    }
}
