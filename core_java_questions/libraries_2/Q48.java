package core_java_questions.libraries_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;


public class Q48 {
    public static void main(String[] args) throws IOException {
        String content=Files.readString(Path.of("customers.txt"));
        Map<String,String> map=new TreeMap<>();

        Pattern p=Pattern.compile("[a-zA-Z]+\\s*-\\s*\\d{10}");
        String[] arr=content.split("\n");
        for(String s:arr){
            if(p.matcher(s).matches()){
                String[] val=s.split("\\s*-\\s*");

                map.put(val[0],val[1]);
            }
        }

        System.out.println(map);





    }
}
