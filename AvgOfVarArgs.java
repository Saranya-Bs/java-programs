import java.util.ArrayList;
import java.util.Scanner;

public class AvgOfVarArgs {
    public static void main(String[] args) {
        // ArrayList<Integer> arr=new ArrayList<>();
        // System.out.println("Enter the arguments : ");
        // Scanner sc=new Scanner(System.in);
        // while(){
        //     arr.add(sc.nextInt());
        // }
        System.out.println( Avg(1,2,3,4,5));

    }
    public static int Avg(int... nums){
        int sum=0;
        for(int i:nums){
            sum+=i;
            //count++;
        }
        return sum/(nums.length);
    } 
}
