import java.util.Scanner;

public class fibonacy {
    public static void main(String[] args) {
        int num;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=ob.nextInt();
        System.out.println("Fibonaccy series are: ");

        int n1=0;
        int n2=0;
        int n3=1;
        int sum=1;
        System.out.print("1 ");
        for(int i=0;i<num;i++){
            n1=n2;
            n2=n3;
            n3=n1+n2;
            System.out.print(n3+" ");
            
            sum=sum+n3;
        }
        System.out.println();
        System.out.println("The sum of fibonnacy series are: "+sum);
    }
    
}
