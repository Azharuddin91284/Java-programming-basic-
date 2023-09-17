
public class EvenAll {
    public static void main(String data[]) {
        System.out.println("Good morning Mr. Azharuddin bhai:");

        for(int i=1;i<=50;i++){
            if(i%2==0){
            System.out.println("Azharuddin Ansari "+i);
            }
        }
        //Turnary operator is used for checking the single condition .also structure will be mention in below;
        int n=30;
        String str= " ";
        str= n%2 == 0 ? "Even":"Odd";
        System.out.println(str);

        int n1=30;
        int result=n%2;
        if(result==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }


        int n2=57;
        if(n2 % 2 ==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }


        int n4=4;
        if(n4 ==1){
            System.out.println("Sunday");
        }
        else if(n4 <=3 && n4>=2){
            System.out.println("Monday");
        }
        else if(n4 <=4 || n4>=3){
            System.out.println("Friday");
        }
        else{
            System.out.println("Cheated");
        }

        


        int n3=20;
        switch(n3){
            case 1:
               System.out.println("Sunday");
            break;
            case 2:
               System.out.println("Monday");
            break;
            case 3:
               System.out.println("Wednesday");
            break;
            case 4:
               System.out.println("Friday");
            break;

            default:
               System.out.println("Hollyday");

        }


        int i=1;
        while(i<=5){
            System.out.println("Sabnam Darling");
            i++;
        }

        int j=1;
        while(j<=20){
            if(j%2==0){
                System.out.println(j);
                j++;
            }

        }


        int m=1;
        do{
            System.out.println("Sabnam");
            m++;
        }while(m<=10);


        for(int k=0;k<=30;k++){
            System.out.println("Sabnam darling " +k);
        }
    }

}
