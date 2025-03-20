package strings;

public class ArrayRev {
    
    public static void main(String[] args) {
        int arr[] = { 10, 10,20, 30, 30, 40,40, 50, 60,60};

        int count = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            count++;
        }
        // //reversing
        // int p = arr.length - 1;
        // int k = 0;
        // while (p >= k) {
        //     int t = arr[k];
        //     arr[k] = arr[p];
        //     arr[p] = t;
        //     k++;
        //     p--;
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        // int dupli_index = -1;
        int new_size = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = arr[i + 1];
                arr[i + 1] = -1;
            }
        }
      
        // removing duplicates
        for (int i = 0; i < n; i++) {
            if (arr[i] == -1) {
                int k = i;
                while (k < n-1) {
                    arr[k] = arr[k + 1];
                    arr[k + 1] = -1;
                    k++;
                }
           }
        }
        // for (int i = 0; i < n; i++) {
        //     System.out.println(arr[i]);
        // }
       
        int arr1[] = {3,6,9,8,5,2,1};
        int k = 3;
        for (int i = k+1; i < arr1.length; i++) {
            int t = arr1[(k + i) % arr1.length];
            // System.out.println(arr1[i]);
            arr1[(k + i) % arr1.length] = arr1[i];
            arr1[i] = t;

        }
        for (int j = 0; j < arr1.length; j++) {
            System.out.println(arr1[j]);
        }
        // int zero_inde = -1;
        // int j = 0;
        // for (int i = 0; i < arr1.length; i++) {
        //     if (i != j && arr1[i] != 0) {
        //         int t = arr1[i];
        //         arr1[i] = arr1[j];
        //         arr1[j] = t;
        //         j++;
        //     }
        // }
    }
}
