class B{
    public int  add(int x,int y){
        return x+y;
    }
    public int  sub(int x,int y){
        return x-y;
    }
}

class C extends B
{
    public int multi(int x,int y){
        return x*y;
    }

}

class D extends C{
    public int Division(int x,int y){
        return x/y;
    }
}





public class Demmo {
    public static void main(String[] args) {
        D obj=new D();
        //A obj=new A();
        int r1=obj.add(5,8);
        int r2=obj.sub(6,4);
        int r3=obj.multi(5,7);
        int r4=obj.Division(6,3);
        System.out.println(r1 + " \n"+ r2+"\n "+r3+" \n"+r4);
        
    }
    
}
