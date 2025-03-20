package strings;

public class StringBuilderJava {
    
    public static void main(String[] args) {
        
        StringBuilder builder = new StringBuilder("Pranjal");

        builder.append(" is feeling Well");
        System.out.println(builder.length());
        builder.insert(23, " Python");
        builder.replace(0, 1, "@");
        System.out.println(builder.length());
        System.out.println(builder.capacity());
        System.out.println(builder);
        char arr[] = new char[builder.length()];
        arr = builder.toString().toCharArray();
        System.out.printf("[");
        int i = 0;
        for (char c : arr) {
            if (c != ' ') {
                System.out.printf("'%c'", c);
                if (i != arr.length - 1)
                    System.out.printf(",");
            }
            i++;
        }
        System.out.printf("]");
    }
}
