package conditional_statements;

import java.util.Scanner;
public class SwitchCase {
    

    public static void main(String args[]) {
        
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int a = 0, b = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter the operation u want: ");
        op = sc.next().toCharArray()[0];
        System.out.println("Operation entered = " + op);
        int res = 0;
        switch (op) {
            case '+':
                res = a + b;
                break;

            case '-':
                res = a - b;
                break;

            case '*':
                res = a * b;
                break;

            default:
                System.out.println("Invalid Entry!");
                return;
        }
        if (res != 0) {
            System.out.println("result = " + res);
        }
        double test = 2.356677777;
        System.out.printf("%.2f\n", test);
        Integer ae = Integer.valueOf(30);
        System.out.println(ae.floatValue());
    }
}
