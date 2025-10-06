package core_java_questions.libraries_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String file=sc.nextLine();
        int up=0,low=0,dig=0;
        int ch;

        BufferedReader bf=new BufferedReader(new FileReader(file));
        while((ch=bf.read())!= -1){
            if(Character.isUpperCase(ch))up++;
            else if(Character.isLowerCase(ch))low++;
            else if(Character.isDigit(ch))dig++;
        }
        System.out.println("lowercase: "+low+"  uppercase: "+up+"  Digits: "+dig);

        sc.close();
        bf.close();
        
    }
}
