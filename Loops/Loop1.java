package Loops;

public class Loop1 {
    public static void main(String[] args) {
        char start[][] = new char[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                start[i][j] = '@';
            }
        }
        start[40][60] = '*';
        start[60][30] = '*';
        start[60][60] = '*';
        for (int i = 0; i < 100; i++) {
            System.out.println(" ");
            for (int j = 0; j < 100; j++) {
                if (start[i][j] == '*') {
                    System.out.print(start[i][j] + " ");
                }
                else {
                    System.out.print(" ");
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
        }
        System.out.println("");
        loop: for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 9) {
                break loop;
            }
        }
        
    }
}
