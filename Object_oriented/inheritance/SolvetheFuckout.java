package inheritance;
import java.util.Scanner;

class A{
    public void dd(){
        System.out.println("Only single dd in class A");
    }
}

class B extends A{
    @Override
    public void dd() {
        System.out.println("calling dd function on class B");
    }
}
public class SolvetheFuckout {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // int unit = sc.nextInt();

        int totalCost = 0;

        // while(unit > 0){

        //     if(unit > 400){
        //         totalCost += 1 * 8;
        //     }
        //     else if(unit > 200){
        //         totalCost += 1 * 5;
        //     }
        //     else if(unit > 100){
        //         totalCost += 1 * 3;
        //     }
        //     else {
        //         totalCost += 1 * 2;
        //     }

        //     unit--;
        // }

        // if(unit <= 100){
        //     totalCost += unit * 2;
        // } else if(unit <= 200){
        //     totalCost += 100 * 2 + (unit - 100) * 3;
        // } else if(unit <= 400){
        //     totalCost += 100 * 2 + 100 * 3 + (unit - 200) * 5;
        // } else {
        //     totalCost += 100 * 2 + 100 * 3 + 200 * 5 + (unit - 400) * 8;
        // }
        // System.out.println("Total cost = " + totalCost);

        A a = new A();
        a.dd();

        A bb = new B();
        bb.dd();
        

        
    }

}
