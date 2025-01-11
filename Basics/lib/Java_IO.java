import java.util.*;

public class Java_IO {
    static Scanner scn_in = new Scanner(System.in);
    public static void runnable() {

            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<< Area Calculator >>>>>>>>>>>>>>>");
            System.out.println("Enter the radius: ");
            double radius = 0.0;
            double area = 0.0;
            radius = scn_in.nextDouble();
            area = 3.14 * radius * radius;
            System.out.printf("Area of circle is = %1.2f", area);
            
    }
    public static void main(String[] args) {
        /*
        common way to take input from user is Using `Scanner class` which is a part of java.util.package. the scanner class can read input from various sources like console, files or streams.
         */
        System.out.println("Enter the 5 numbers: ");
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        while (list.size() < 5 && (list.getLast().intValue() != -1)) {
            list.add(scn_in.nextInt());
        }
        System.out.println("Printing List");
        for (Integer integer : list) {
            System.out.println(integer);
        }
        Thread runner = new Thread(new Runnable() {
            public void run() {
                runnable();
            }
        });
        try{
        runner.wait(2000);
    } catch (InterruptedException e) {
            System.out.println("Intrrupted exception occurred\n");
        }
    }
}
