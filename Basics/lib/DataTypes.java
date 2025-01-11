import java.util.Scanner;

public class DataTypes {
    static public void main(String args[]){
        int age =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age please: ");
        age = sc.nextInt();
        boolean isYoung = age >= 5 && age <= 30;
        if (isYoung) {
            System.out.println("Yes!. A Young Human 😈.\n");
            isYoung = false;
        }
        else {
            System.out.println("You Old Fart!.😹");
        }

        // Numeric data types
        byte b = 123;
        short a = 32012;
        System.out.println(
                "Size of byte: " + Byte.BYTES + " bytes\n" +
                        "Size of short: " + Short.BYTES + " bytes\n" +
                        "Size of int: " + Integer.BYTES + " bytes\n" +
                        "Size of long: " + Long.BYTES + " bytes\n" +
                        "Size of float: " + Float.BYTES + " bytes\n" +
                        "Size of double: " + Double.BYTES + " bytes\n" +
                        "Size of char: " + Character.BYTES + " bytes\n" +
                        "Size of boolean: " + "1 bit (JVM dependent)"
        );

        // Non-primitive types of data type

        String s = "Pranjal Dubey";
        System.out.println(s);

        // we also create a string variable using new keyword to instantiate its object
        String obj = "Hello There";
    }
}
