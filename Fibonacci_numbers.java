// Question:
// Display first 10 Fibonacci numbers.

public class Fibonacci_numbers {
    public static void main(String[] args) {
    int a=0,b=1; //first 2 fibonacci numbers
    for(int i=0;i<10;i++){
        System.out.print(a+" ");
        b=a+b;
        a=b-a;
    }
    }
    
}
