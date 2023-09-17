import java.util.Scanner;

public class REverse{
    public static void main(String[] args) {
        int num,reversed=0;
        Scanner a=new Scanner(System.in);
        
        System.out.println(" Enter the Original number:");
        num=a.nextInt();
        while(num!=0){
            int remainder=num%10;
            reversed=reversed*10+remainder;
            num /=10;
        }
        System.out.println("Reversed Number is: "+reversed);


        System.out.println();
        for(;num!=0;num=num/10){
            int remainder=num%10;
            reversed=reversed*10+remainder;



       

        }
        System.out.println("Reversed number: "+reversed);

    }
}