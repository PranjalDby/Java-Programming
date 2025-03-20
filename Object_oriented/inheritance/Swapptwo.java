package inheritance;


interface helper{
    public void a();
    public void a(int a);
}

class Base implements helper{
    @Override
    public
    void a(){
        System.out.println("function without parameter");
    }  
    @Override
    public void a(int a) {
        System.out.println("Function with parameters\n");
        System.out.println(a);
    }


}
public class Swapptwo {
    
    public static void main(String []args){
        int a = 10;
        int b = 8;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }
}
