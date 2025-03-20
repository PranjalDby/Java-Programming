package commandline_args;

import java.util.Scanner;

public class Command_line1 {

    /*
    Command-line arguments
     */
    public static void main(String []args){
        System.out.println("Demonstrating the command line arguments");
        if(args.length > 0){
            System.out.println("Length of args = " + args.length);
            for(String i:args){
                System.out.println(i);
            }
        }
        else{
            System.out.println("Please enter something");
        }

        int a = 10;
        a = ++a + 1;
        System.out.println(a);

        int age =0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        age = Sc.nextInt();
        int isAllowed = age > 18 ? 1:0;
        if(isAllowed == 1){
            System.out.println("U're allowed");
        }
        else{
            System.out.println("Not Allowed");
        }
        if(true || (age > 18) && (age <= 20)){
            System.out.println("What it Evaluates = " + ((age > 18) && (age <= 20)));
            System.out.println("Printing star");
        }
    }
}
