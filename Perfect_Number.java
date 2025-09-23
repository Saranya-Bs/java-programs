import java.util.Scanner;
public class Perfect_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPerfect(n)){
            System.out.println(n+ " is a Perfect Number");
        }
        else{
            System.out.println(n+" is not a Perfect Number ");
        }
    }
    public static boolean isPerfect(int n){
        int sum=1;
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                sum=sum+i;
                if(i!=(n/i))sum+=(n/i);
            }
        }
        return sum==n;
        
    }
}
