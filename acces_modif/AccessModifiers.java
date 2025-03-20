package acces_modif;

public class AccessModifiers {

    /*
    *@Brief
    * here we talk about Java's access modifiers which helps to restrict the scope of class, constructor,method,data member.
    * it provides the security,accessibility, etc.
    * Types of Access Modifiers🌀
    * ----------------------------------------------
    * 1️⃣
    * Default:if no access modifier is provided.the default access modifier are accessible only within the same package.
    * ⚠️if you try to access the members with default access  control you will get a compilation error.
    * ----------------------------------------------
    * 2️⃣
    * private: The private access modifier is used when we want to totally isolate the data members as well as the member functions of class to be accessed by other classes or from another packages. it means the members and methods only accessed inside the class only.
    * Note:
    * top-level classes or interfaces can not be declared as private because,
    * private means "only visible within the enclosing class."
    * protected means "only visible within the enclosing class and any subclasses"
     ----------------------------------------------
    *3️⃣
    * protected: the protected access modifier is specified using protected keyword.the members and member functions that are declared using this modifier can access within the same package or by subclasses of different packages.
    *
    * 🌟 Very Important Note:
    *  by default all the members and members functions have default access. modifier.
    -----------------------------------------------
    * 4️⃣
    * public: the public access modifier is specified using the keyword public.
    * the public access modifier has the widest scope among all other access modifiers.
    * classes,members and member functions that are declared as public are accessible from everywhere in the program.there is no restriction
     */

    static protected class Dog {
        private double fixed_price = 22000.24;
        public int age;
        public String color, name;

        public Dog(int age, String color, String name) {
            System.out.println("Constructor called");
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private double getQuote() {
            return age > 0 ? fixed_price : 0.0;
        }

        protected void displs() {
            System.out.println("3️⃣2️⃣1️⃣⚠️🌀😀d");
        }
    }

    //default access modifier method
    void printMe() {
        System.out.println("Printed me");
    }

    void add() {
        add(10, 50);
    }

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {

    }
}
