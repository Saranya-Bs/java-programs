import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
public class NonBlankLines {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("demofile.txt");
        LineNumberReader lr=new LineNumberReader(fr);
        String line;
        String s="a";
        while((line=lr.readLine())!=null){
            if(line.contains(s)){
                System.out.println("Line number: "+lr.getLineNumber()+"-->"+line);
            }
        }

        lr.close();
    }
}
