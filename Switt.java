import java.util.Scanner;

public class Switt{
    public static void main(String[] args) {
        int a,b,ch,c;
        
        Scanner az=new Scanner(System.in);
        System.out.println("Enter the  first Number: ");
        a=az.nextInt();
        System.out.println("Enter the  Second Number: ");
        b=az.nextInt();
        System.out.println("Enter the choice: ");
        ch=az.nextInt();

        switch(ch){
            case 1:{
                c=a+b;
                System.out.println("Addition of the two numbers are: "+c);
                break;
            }
            case 2:{
            c=a-b;
            System.out.println("Substraction of the two numbers are: "+c);
            break;
            }

            case 3:{

            c=a*b;
            System.out.println("Multiplication of the two numbers are: "+c);
            break;
            }

            default:{
               System.out.println("Anything of the two jumbers are not possible which is invalid: ");
            }
        }
    }
}
    





