import java.util.*;
import java.math.*;
public class Operators {

    public static String decimal2Bin(int num){
        StringBuilder res = new StringBuilder();
        boolean flag = false;
        if(num < 0){
            flag = true;
            num = ((~num) | 1);
        }
        System.out.println(num);
        while(num != 0){
            int remainder = num % 2;
            res.append(remainder);
            num /= 2;
        }
        if(flag) {
            res.append('1');
        }
        res.reverse();
        System.out.println("after insertion res = " + res
        );

        return res.toString();
    }
    public static int bin2Decimal(String binary){
        int n_digits = binary.length();
        int res = 0;
        int i = 0;
        boolean contain_sign = false;
        if(binary.charAt(0) == '1'){
            contain_sign = true;
        }
        while(i < n_digits){
            if(binary.charAt(i) != '1' || i != 0) {
                res = (int) (binary.charAt(i) - '0') + (res * 2);
                System.out.println("sign = " + binary.charAt(i));
                System.out.println("res = " + res);
            }
            i++;
        }
        if(contain_sign){
            res *= -1;
        }
        return res;
    }
    public static void main(String[] args){
        //Bitwise operator
        /*
            // >> right-shift
            // xor
            // << left-shift
            // ~ complement or inverse

         */
//        int num1 = 5;
//        System.out.println("Binary equiv = " + decimal2Bin(num1));
//        System.out.println("after right-shift = " + (num1 >> 2));
//        num1 = num1 >> 1;
//        String binary = decimal2Bin(-2);
//        System.out.println("Bin = " + binary);
//        System.out.println("Bin to decimal = " + bin2Decimal(binary));
//        Complement operator or inverter operator
//        System.out.println("binary = " + (~2));
        int num1 = -135;
        String res = decimal2Bin(num1);
        System.out.println(bin2Decimal(res));
    }
}
