import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r=ob.nextDouble();
        double area=3.14*r*r;
        double arean=22*r*r/7;
        System.out.println("The area of the circle is: "+area);
        System.out.println("The area is: "+arean);
    }
    
}
