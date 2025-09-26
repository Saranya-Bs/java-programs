package core_java_questions.oops_1;

class Student{
    int admin_no;
    String stu_name;
    String course_joined="Java";
    int fees_paid;
    int total_fee;

    public Student(int admin_no,String stu_name,int fees_paid){
        this.admin_no=admin_no;
        this.stu_name=stu_name;
        this.course_joined="Java";
        this.fees_paid=fees_paid;
    }

    public Student(int admin_no,String stu_name,String course_joined,int fees_paid){
        this.admin_no=admin_no;
        this.stu_name=stu_name;
        this.course_joined=course_joined;
        this.fees_paid=fees_paid;
    }

    public int getTotalFee(){
        if(course_joined.equals("Java")){
            total_fee=10000;
        }
        else if(course_joined.equals("Python")){
            total_fee=7500;
        }
        return total_fee;
    }


    public int getDue(){
        return total_fee-fees_paid;
    }

    public int getFeePaid(){
        return fees_paid;
    }

    public void payment(int amount){
        if(amount<=0){
            System.out.println("Enter valid amount");
            return;
        }
        fees_paid+=amount;
        System.out.println("Payment Successful");
    }
}

public class Q15 {
    public static void main(String[] args) {
        Student st=new Student(1,"blue",0 );
        System.out.println(st.getFeePaid());
    }
}
