package javaArrays;

////class Dog {
////    String name;
////    int age;
////
////    public Dog(String name, int ag) {
////        this.name = name;
////        age = ag;
////    }
////
////    public Dog() {
////        System.out.println("Calling default\n");
////    }
////
////    public void display() {
////        System.out.println("Dog Name =  " + this.name);
////        System.out.println("Dog age =  " + this.name);
////    }
//}
class TypesToInitObject {
    
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        
        try{
            Class cls = Class.forName("Dog");
            Dog dg = (Dog) cls.newInstance();
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}