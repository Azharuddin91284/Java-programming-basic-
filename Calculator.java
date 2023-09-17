import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b,c,num;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the first value: ");
        a=ob.nextInt();
        System.out.println("Enter the second  value: ");
        b=ob.nextInt();
        System.out.println("Enter the choice: ");
        num=ob.nextInt();
        switch(num){
            case 1:
                c=a+b;
                System.out.println("Addition of the given number are: "+c);
                break;
            case 2:
                c=a-b;
                System.out.println("Subtraction of the given nuber are: "+c);
                
                break;
            case 3:
                c=a*b;
                System.out.println("Multiplication of the given number are:"+c);
                break;
            case 4:
                c=a/b;
                System.out.println("Division of thr given numbers are: "+c);
                break;
            case 5:
                c=a%b;
                System.out.println("Floor Division of thr given numbers are: "+c);
                break;

            default:
                System.out.println("Calculator does not accept this case so come out from switch:" +"Now i am feeling not good but its working properly");
            



        }

        
        
    }
    
}
