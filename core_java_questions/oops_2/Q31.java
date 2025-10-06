package core_java_questions.oops_2;

class InsufficientBalanceException extends Exception{

    static double balance=0;

    public InsufficientBalanceException(double amt){
        super("Insufficient Balance "+balance+" for withdrawal of "+amt);
    }

    public void withdraw(double amt) throws InsufficientBalanceException{
        if(balance==01 || amt>balance){
            throw new InsufficientBalanceException(amt);
        }
        else{
            balance-=amt;
            System.out.println("Balance is: "+balance);
        }
    }

    public void deposit(double amt){
        balance+=amt;
        return;
    }
    

    
}

public class Q31 {
    public static void main(String[] args) {
        InsufficientBalanceException obj=new InsufficientBalanceException(0);
        obj.deposit(1200);
        try{
        obj.withdraw(100);
        }
        catch(InsufficientBalanceException ex){
            System.out.println(ex.getMessage());
        }
    }
}
