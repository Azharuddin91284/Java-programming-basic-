public class A {
    //String name="Azharuddin";
    //int age=21;
    //String Fbpass="7vcd89";

    private String name="Azharuddin";
    private int age=21;
    private String Fbpass="7vcd89";

    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String getFbpass(){
        return Fbpass;
    }
   // public void setage(int a){
   //     age=a;
    //}
    public void setage(int age){
        this.age=age;
    }

   
//This is a special keyword which is also known as current object and this is help ti differentiate the instance and local variable
//this.age=instance variable, age=local variable
//local variable is under the method and instance variable out of method.
    
}
