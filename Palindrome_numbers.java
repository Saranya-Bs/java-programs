public class Palindrome_numbers {
    public static void main(String[] args) {
        for(int i=1000;i<2000;i++){
            if(i==Palindrome(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static int Palindrome(int n){
        int num=n;
        int temp=0;
        while(num>0){
            temp=temp*10+num%10;
            num/=10;
        }
        return temp;
    }
}
