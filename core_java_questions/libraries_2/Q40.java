package core_java_questions.libraries_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q40 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("names.txt"));
        BufferedReader br2=new BufferedReader(new FileReader("names2.txt"));

        Set<String> set=new LinkedHashSet<>();
        String s1,s2;
        while((s1=br.readLine())!=null){
            set.add(s1);
        }
        while((s2=br2.readLine())!=null){
            set.add(s2);
        }
        set.forEach(System.out::println);

        br.close();
        br2.close();

    }
}
