package core_java_questions.oops_2;

interface AccountOperations {
    
    public void deposit(double num);
    public double getBalance();

    
}

class Account implements AccountOperations{
    double amount;

    public Account(int amount){
        this.amount=amount;
    }
    public void deposit(double num){
        if(num<=0){
            System.out.println("Deposit a valid amount!");
            return;
        }
        amount+=num;
        System.out.println("Deposited "+num+" rupees.\nBalance is: "+amount);
    }
    public double getBalance(){
        return amount;
    }
}

public class Q27{
    public static void main(String[] args) {
        Account a=new Account(1200);
        a.deposit(1234);
        System.out.println(a.getBalance());
    }
}