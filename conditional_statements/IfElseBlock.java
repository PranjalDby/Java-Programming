package conditional_statements;

import java.util.*;
public class IfElseBlock {
    public static void main(String[] args) {
        
        /*
         * If blocks with nested-if and if-elseif-conditions
        */

        int number1,number2,number3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 number = ");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
        int max = -1;
        if (number1 > number2 && number1 > number3) {
            max = number1;
        }
        else if(number2 > number1 && number2 > number3){
            max = number2;
        }
        else if (number3 > number1 && number3 > number2) {
            max = number3;
        }
        else {
            System.out.println("OOps all are same");
        }
        System.out.println("Maximum of three = " + max);

        System.out.println("Enter Some Chars");
        char as = sc.next().toCharArray()[0];
        System.out.println(as);


    }
}
