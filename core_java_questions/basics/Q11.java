package core_java_questions.basics;

public class Q11 {
    public static void main(String[] args) {
     
    if(args.length == 0) {
        System.out.println("Enter a number: ");
        return;
    }
    
    int num=Integer.parseInt(args[0]);
    int len;
    if(args.length>1){
        len=Integer.parseInt(args[1]);
    }
    else{
        len=15;
    }
    for(int i=1;i<=len;i++){
            
            System.out.println(num+" * "+i+" = "+(num*i));
    }

    }
}
