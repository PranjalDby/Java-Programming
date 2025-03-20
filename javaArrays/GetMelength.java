package javaArrays;
public class GetMelength {
    public static void main(String[] args) {
        int n = 10244;

        int lenght = 0;

        while (n != 0) {
            lenght++;
            n /= 10;
        }
        System.out.println(lenght);
    }
}
