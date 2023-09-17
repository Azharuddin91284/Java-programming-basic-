import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Person {
    int age;
    
    
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=ob.nextInt();
        System.out.println(age);
        
    }
    
}
