public class Demo {
    public static void main(String[] args) {
        
    
    A obj=new A();
    //System.out.println(obj.age);
    //System.out.println(obj.name);
    //System.out.println(obj.Fbpass);

    System.out.println(obj.getname());
    System.out.println(obj.getage());
    System.out.println(obj.getFbpass());
    obj.setage(35);
    System.out.println(obj.getage());

    }

}
