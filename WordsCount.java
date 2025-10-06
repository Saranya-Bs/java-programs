import java.io.FileReader;
import java.io.IOException;
public class WordsCount {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("demofile.txt");
        int count=1;
        int i;
        while((i=fr.read())!=-1){
            if((char)i==' '|| (char)i=='\n'){
                count++;
            }

        }
        fr.close();
        System.out.println("There are "+count+" words in the file.");

    }
}
