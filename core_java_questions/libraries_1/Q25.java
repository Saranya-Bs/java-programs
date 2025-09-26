package core_java_questions.libraries_1;
import java.util.Scanner;
import java.util.ArrayList;
public class Q25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the names: ");
        ArrayList<String> st=new ArrayList<>();
        String s=sc.nextLine();
        while(!s.equals("END")){
            
            st.add(s);
            s=sc.nextLine();
        }
        
        for(int i=0;i<st.size();i++){
            System.out.print(st.get(i)+"-");
        }

        sc.close();
    }
}
