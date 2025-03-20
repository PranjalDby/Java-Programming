package inheritance;

import java.util.ArrayList;
public class StringBuilderRev {
    

    public static void main(String args[]){
        StringBuilder str_build = new StringBuilder("Aalindrome");
        System.out.println("Exploring all functions");

        System.out.println(str_build.capacity());
        System.out.println("after deleting the some characters");
        
        str_build.deleteCharAt(4);
        System.out.println(str_build);
        System.out.println(str_build.length());

        //appending the new element
        str_build.append(" Character 😀");
        String new_str = str_build.subSequence(3,6).toString();
        System.out.println(new_str);

        System.out.println(str_build.codePointAt(0));
    }



}
