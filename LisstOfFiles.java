import java.io.File;
import java.util.Scanner;
public class LisstOfFiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the directory name: ");
        String dir=sc.nextLine();
        File directory=new File(dir);
        if(directory.exists() && directory.isDirectory() ){
            File[] fi=directory.listFiles();
            for(File i:fi){
                System.out.println(i+"  ");
            }
        }
        else{
            System.out.println("Enter valid name. ");
        }

        sc.close();
    }
}
