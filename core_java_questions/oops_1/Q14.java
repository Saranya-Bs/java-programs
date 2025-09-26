package core_java_questions.oops_1;


class Counter{
    int curr_val;

    public Counter(){
        this.curr_val=0;
    }

    public Counter(int val){
        this.curr_val=val;
    }

    public void increment(){
        curr_val+=1;
        
    }

    public void decrement(){
        curr_val-=1;
    }

    public int count(){
        return curr_val;
    }

}

public class Q14 {
    public static void main(String[] args) {
        Counter c=new Counter(3);
        c.increment();
        System.out.println(c.count());
    }
}
