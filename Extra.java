import java.util.*;
class Extra{
    static public void main(String args[]){
        System.err.println(
            "Calling Extra library"
        );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:\n");
        int n,n2 = 0;
        n = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("Sum of Two number is = " + (n + n2));
    }
}