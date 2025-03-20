package inheritance;

class A{
    public void dd(){
        System.out.println("Only single dd in class A");
    }
    public void dd(int a){
        System.out.println("Only single dd in class A with parameter = " + a);
    }
}

class B extends A{

    public void bb(){
        System.out.println("Only single bb in class B");
    }
    public static void bb(int z){
        System.out.println("Only single bb in class B with parameter = " + z);
    }
}

class C extends B{

    @Override
    public void dd(int a) {
       System.out.println("Calling dd from inside the class C = " + a);
    }
    public void cc(){
        System.out.println("Only single cc in class C");
    }
    public void cc(int x){
        System.out.println("Only single cc in class C with parameter = " + x);
    }
}

abstract class helper{
    abstract public void doit(int a);
    public void iterale(int... a){
        System.out.println("iterable printing machine");
    }
}

@SuppressWarnings("removal")
class Cc extends helper{
    @Override
    public void doit(int a){
        System.out.println("Doing something  = " + a);
    }
    @Override
    public void iterale(int... a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

}
public class ClassActivity {
    
    public static void main(String []args){

        C cc = new C();
        cc.dd(30);

        Cc ccc = new Cc();
        ccc.iterale(10,20,30,40,50,100,101);
    }
}
