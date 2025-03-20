package javaArrays;
import java.io.*;
class Dog implements Serializable{
    String name;
    int tag;
    
    Dog(String name, int ta) {
        this.name = name;
        this.tag = ta;
    }

    int serialVersionUID = 1;
    void print_info() {
        System.out.println("Name of dog = " + this.name);
    }
}

public class Serialization {

    public static void main(String[] args) {
        File fi = new File("obj_file");
        try {
            FileOutputStream file_write = new FileOutputStream(fi);
            ObjectOutputStream write_obj = new ObjectOutputStream(file_write);
          
            Dog dg = new Dog("bruno", 123);
            write_obj.writeObject(dg);
        
            write_obj.close();
            System.out.println("Writting complete");

        }
        catch (Exception e) {
            System.out.println("Exception Occured");
            e.printStackTrace();
        }
        
        //getting the object deserializtion
        try {
            FileInputStream read = new FileInputStream(fi);
            ObjectInputStream read_obj = new ObjectInputStream(read);
            Object ob = read_obj.readObject();
            Dog obj = (Dog) ob;
            System.out.println(obj.name);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e2) {

        }
        catch(ClassNotFoundException e3){
            System.err.println(e3);
        }

    }

}
