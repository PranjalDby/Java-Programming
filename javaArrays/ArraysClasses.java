package javaArrays;

public class ArraysClasses {
    
    enum DAYS {
        MONDAYS,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
                    
    };

    class Dog {
        String name;
        int age;

        public Dog(String name, int ag) {
            this.name = name;
            age = ag;
        }

        public Dog() {
            System.out.println("Calling default\n");
        }

        public void display() {
            System.out.println("Dog Name =  " + this.name);
            System.out.println("Dog age =  " + this.name);
        }
    }

    class Shape {
        
        int l, b, h;

        Shape(int l) {
            this.l = l;
        }

        Shape(int l, int b) {
            this.l = l;
            this.b = b;
        }

        Shape(int l, int b, int h) {
            this.l = l;
            this.b = b;
            this.h = h;
        }

        public int area(String sh) {
            if (sh == "square" && this.l != 0) {
                return l * l;
            }
            else if (sh == "rectangle" && (this.l != 0 && this.b != 0)) {
                return l * b ;
            }
            return 2 * (l*b + b * h + h * l);
        }
    }
    public static void main(String[] args) {
        // int[] arr2 = new int[10];
        // for (int i = 0; i < arr2.length; i++) {
        //     arr2[i] = (int) (Math.random() * 100); // generates random numbers between 0 and 99
        // }
        // // Arrays.fill(arr1, 10);
        // Arrays.sort(arr2);
        // for (int i : arr2) {
        //     System.out.println(i);
        // }
        // System.out.println("");
        // // System.out.println("Maximum element in array = " + Arrays.M);
        // OptionalInt a = Arrays.stream(arr2).max();
        // System.out.println(a.getAsInt());
        // // System.out.println(Arrays.binarySearch(arr2, 50));

        // for (int i = 0; i < DAYS.values().length; i++) {
        //     System.out.println("=> " + DAYS.values()[i]);
        // }
        // System.out.println("");
        // System.out.println("Using for-each loop");
        // for (DAYS i : DAYS.values()) {
        //     System.out.println(i);
        // }
        // DAYS dd[] = DAYS.values();
        // System.out.println(dd[0]);
        ArraysClasses cls = new ArraysClasses();
        // Dog dd2 = cls.new Dog("Husky", 18);
        // dd2.display();

        ArraysClasses.Shape sqr = cls.new Shape(10);
        ArraysClasses.Shape rec = cls.new Shape(10,20);
        ArraysClasses.Shape cub = cls.new Shape(10,3,4);
        System.out.println("Area of sqr = " + sqr.area("square"));
        System.out.println("Area of rectangle = " + rec.area("rectangle"));
        System.out.println("Area of cuboid = " + cub.area("cuboid"));
    }
}
