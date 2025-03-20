package strings;

public class Exercises {
    public static void main(String[] args) {
        int arr[] = { 10, 11, 34, 22, 87, 7, 6 };
        int even_sum = 0;
        int odd_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even_sum += arr[i];
            } else {
                odd_sum += arr[i];
            }
        }
        System.out.println("Even sum = " + even_sum);
        System.out.println("odd sum = " + odd_sum);

        String name = "AL Open Up for shoola!";
        name = name.toLowerCase();
        int count_chars = 0;
        char chr_arr[] = name.toCharArray();
        System.out.println("Char arr length = " + chr_arr.length);
        for (char i : chr_arr) {
            if (i != ' ') {
                count_chars++;
            }
        }
        System.out.println("characters = " + count_chars);
        int no_words = 0;
        for (char i : chr_arr) {
            if (i == ' ') {
                no_words++;
            }
        }
        no_words++;
        System.out.println("no of word = " + no_words);
        int max = -9999;
        int j = 0;
        for (int i = 0; i < chr_arr.length; i++) {
            int recent_count = 0;
            while (j < chr_arr.length && chr_arr[j] != ' ') {
                recent_count++;
                j++;
            }
            j++;
            // System.out.println(recent_count);
            if (max < recent_count) {
                max = recent_count;
            }
        }

        int consonant_count = 0;
        int vowel_count = 0;
        
        for (int i = 0; i < chr_arr.length; i++) {
            if (chr_arr[i] >= 'a' && chr_arr[i] <= 'z') {
                if (chr_arr[i] == 'a' || chr_arr[i] == 'e' || chr_arr[i] == 'i' || chr_arr[i] == 'o'
                        || chr_arr[i] == 'u') {
                    vowel_count++;
                } else {
                    consonant_count++;
                }
            }
        }
        System.out.println("vowel count = " + vowel_count);
        System.out.println("other count = " + consonant_count);
        System.out.println("max = " + max);
        ;
    }
}
