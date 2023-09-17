import java.util.Scanner;

public class Addition {
    
    
    public static void main(String[] args) {
    int a;
    int b,sum;
    
    Scanner ap=new Scanner(System.in); 
    System.out.println("Enter the first value:");
    a=ap.nextInt();
    System.out.println("Enter the Second value:");
    b=ap.nextInt();
    sum=sum(a,b);
     

   
    System.out.println("Addition of Two number is:" +sum);
    }
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    
}
