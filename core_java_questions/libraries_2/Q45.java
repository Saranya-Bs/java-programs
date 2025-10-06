package core_java_questions.libraries_2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name: ");
        String file=sc.nextLine();

        String content=Files.readString(Path.of(file));
        content=content.replaceAll("\\s+", " ");
        Files.writeString(Path.of("ans.txt"), content);

        sc.close();

    }
}
