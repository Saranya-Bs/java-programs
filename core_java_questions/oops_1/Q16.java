package core_java_questions.oops_1;


class Employee{
    int emp_id;
    String emp_name;
    int bus_no;
    int emp_boards;
    public Employee(int emp_id,String emp_name){
        this.emp_id=emp_id;
        this.emp_name=emp_name;
    }
}

class FactoryEmployee extends Employee{
    public FactoryEmployee(int emp_id,String emp_name,int bus_no,int emp_boards){
        super(emp_id,emp_name);
        this.bus_no=bus_no;
        this.emp_boards=emp_boards;
    }

    public void display(){
        System.out.println("FactoryEmployee id: "+emp_id+"\nBus no:"+bus_no+"\nEmployees boarding: "+emp_boards);
    }
}

public class Q16 {
    public static void main(String[] args) {
        FactoryEmployee em=new FactoryEmployee(1,"alice", 2, 3);
        em.display();
    }
}
