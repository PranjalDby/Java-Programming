package javaArrays;
public class Array1 {
    
    public static void main(String args[]) {
        
        int arr[] = {100,10,12,8,14,6,16,4,18,2,20,-1,0}; //statically defining the array
        
        // // char ch[] = { 'a', 'b', 'c', 'd', 'e' };
        // System.out.println(arr.getClass().getTypeName());
        // double db[] = new double[20];
        // db[0] = 3.432;
        // System.out.println(db.getClass());
        
        // System.out.println("Enter the number to find = ");
        // Scanner sc = new Scanner(System.in);
        // int find = sc.nextInt();
        // for (int i = 0; i < arr.length; i++) {
        //     if (find == arr[i]) {
        //         System.out.println("Founded!!!");
        //         return;
        //     }
        // }
        // System.out.println("Not found!.");
        // Finding the second smallest element in the array
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
            System.out.println("Second min = " + secondMin);
        }
        System.out.println("Second smallest element is: " + secondMin);
        int n = 12;
        for (int i = 2; i < n; i++) {
            if (n % i == 0 || n % 2 == 0) {
                System.out.println("Not prime \n");
                return;
            }
        }
        System.out.println("is a prime number");
    }
}
