package core_java_questions.libraries_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Q39 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("names.txt"));
        Set<String> set=new TreeSet<>();
        String line;
        while((line=br.readLine())!=null){
            set.add(line);
        }
        for(String s:set){
            System.out.println(s);
        }

        br.close();
    }
}
