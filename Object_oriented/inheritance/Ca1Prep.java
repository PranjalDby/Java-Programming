package inheritance;
public class Ca1Prep {
    public static void main(String[] args) {
        int arr[][] = new int[10][20];
        System.out.println(arr[1].length);

        // Some important string functions

        String name = "Pran,jal Dub,ey";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
        //substring extraction
        System.out.println(name.substring(3, 6));

        //searching and comparison

        System.out.println(name.contains("jal"));
        System.out.println(name.equals("pranjal"));
        // if compairing the two string without any case senstivity
        System.out.println(name.equalsIgnoreCase("pranjal dubey"));

        //getting index of string
        System.out.println(name.indexOf("jal"));
        // getting the last occurances of the substring of particular string
        System.out.println(name.lastIndexOf("a"));

        // checking a particular string startswith or endswith a particular string
        System.out.println(name.startsWith("Pr"));
        System.out.println(name.endsWith("al"));


        // splitting and joinning

        String []splitted = name.split(",");
        for (String string : splitted) {
            System.out.printf("%s ",string);
        }
        String name2 = "John abrahm";
        System.out.println();
        String []spli = name2.split(" ");
        System.out.println(String.join("@",spli));
    }
}
