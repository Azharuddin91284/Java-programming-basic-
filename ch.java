import java.util.Scanner;

public class ch {
    public static void main(String[] args) {
        int a,b,ch,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value: ");
        a=sc.nextInt();
        System.out.println("Enter the second value: ");
        b=sc.nextInt();
        System.out.println("Enter the choice: ");
        ch=sc.nextInt();
        switch(ch){
            case 1:{
                c=a+b;
                System.out.println("Addition of the two numbers are: "+c);
                break;
            }
            case 2:{
                c=a-b;
                System.out.println("Subtraction of the two numbers are: "+c);
                break;
            }
            case 3:{
                c=a*b;
                System.out.println("Multiplication of the two numbers are: "+c);
                break;
            }
            default:{
                System.out.println("Exit");
            }
         

        }






    }
    
}
