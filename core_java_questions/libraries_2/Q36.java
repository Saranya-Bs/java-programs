package core_java_questions.libraries_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Q36 {
    public static void main(String[] args) {
        String line;
        int ans=0;
        try(BufferedReader br=new BufferedReader(new FileReader("marks.txt"))){
            while((line=br.readLine())!=null){
                line=line.trim();
                String[] marks=line.split(",");
                for(String m:marks){
                    int mark=Integer.parseInt(m);
                    ans+=mark;
                }
            }

        }
        catch(IOException e){
            System.out.println("IOEXception occured: ");
        }

        System.out.println("Total is: "+ans);

        
    }
}
