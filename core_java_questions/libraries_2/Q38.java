package core_java_questions.libraries_2;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

// public class Q38 {
//     public static void main(String[] args) throws IOException {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter file name: ");
//         String file=sc.nextLine();
//         BufferedReader br=new BufferedReader(new FileReader(file));
//         BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
//         String line;
//         while ((line=br.readLine())!=null) {
//             bw.write(line.toUpperCase());
//             bw.write("\n");
//         }

//         br.close();
//         bw.close();
//         sc.close();
//     }
// }
import java.nio.file.*;
import java.io.IOException;

public class Q38 {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Path.of("names.txt"));
        Files.writeString(Path.of("output.txt"), content.toUpperCase());
        System.out.println("Converted to uppercase and written to output.txt");
    }
}
