package core_java_questions.libraries_2;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Q33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        try(PrintWriter pw=new PrintWriter("names.txt")){
            System.out.println("Enter names (enter END to stop) :");
            while(!(name=sc.nextLine()).equals("END")){
                pw.println(name);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found!!");
        }
        System.out.println("Names written to names.txt");
        sc.close();
    }
}
