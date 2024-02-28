package neopat.classesobjects;

// You are using Java
class OuterClass {
    void print() {
        System.out.println("This is in Outer Class");
    }
}

public class Main1 {
    static OuterClass out = new OuterClass() {
        void print() {
            super.print();
            System.out.println("This is Inner Class");
        }
    };
    public static void main(String[] args) {
        out.print();
    }
}