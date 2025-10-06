package core_java_questions.libraries_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q35 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("names.txt"));
        String line;
        while((line=br.readLine())!=null){
            if(line.length()>5){
                System.out.println(line);
            }

        }
        br.close();
    }
}
