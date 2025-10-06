import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class StringInFile {
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new FileReader("demofile.txt"));
        String st="a";
        String line;
        while((line=bf.readLine())!=null){
            if(line.contains(st)){
                System.out.println(line);
            }
        }
        bf.close();
    }
}
