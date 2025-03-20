package JVM;


class Checker {

    protected String name = "LOGO";
    void display() {
        System.out.println("If it is accessible");
        System.out.println("Displaying Checker 11");
    }
}
public class ClassLoaders {
    public static void main(String[] args) {
        System.out.println("How JVM Load's all the libraries and classes");
        System.out.println(String.class.getClassLoader());
        System.out.println(ClassLoaders.class.getClassLoader());
        Checker checker = new Checker();
        System.out.println(checker.name);
        checker.display();
    }
}
