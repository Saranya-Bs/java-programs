package core_java_questions.libraries_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

public class Q47 {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the path: ");
        String path=sc.nextLine();
        System.out.println("Enter the string: ");
        String str=sc.nextLine();

        try(Stream<Path> files=Files.walk(Path.of(path))){
            files
            .filter(Files::isRegularFile)
            .forEach(file->{
                try{
                    String content=Files.readString(file);
                    if(content.contains(str)){
                        System.out.println("Found in :"+file);
                    }
                }
                catch(IOException e){
                    System.out.println("IOException occurred!");
                }
            });
        }

        sc.close();
    }
}
