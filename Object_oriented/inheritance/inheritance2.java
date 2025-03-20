package inheritance;



class A {
    int a;

    // or
    A() {
        this(100);
    }

    A(int a) {
        this.a = a;
    }
}

class Car {

    String type;
    int cc;
    String company, carName;

    Car(String ty, int cc, String comp, String carName) {
        this.type = ty;
        this.cc = cc;
        this.company = comp;
        this.carName = carName;
    }

    void displayInfo() {
        System.out.printf("Name:%s\ntype:%s\ncompany:%s\npower:%d\n", this.carName, this.type, this.company, this.cc);
    }
}

class BMW extends Car implements helper{
    BMW(String ty, int cc, String comp, String carName){
        super(ty, cc, comp, carName);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("This is BMW");
    }
    @Override
    public void printSymbol() {
        System.out.printf("*");
    }
}


interface helper{
    public static int data = 0;
    public void printSymbol();
}

abstract class podium implements helper{
    void sum(){
        int a= 1 + 1;
    }
    abstract void add();
}
class Mercedez extends Car{
    Mercedez(String ty, int cc, String comp, String carName){
        super(ty, cc, comp, carName);
       
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("This is Mercedez 11");
    }

}
public class inheritance2 {
    
    public static void main(String[]  args)  {
        
        A a = new A();
        System.out.println(a.a);

        Car bmw = new BMW("Sports",2300,"BMW","BMW 800");
        Car merc = new Mercedez("Sedan",1200,"Mercedez","Mercedez A class");
    
    }
}
