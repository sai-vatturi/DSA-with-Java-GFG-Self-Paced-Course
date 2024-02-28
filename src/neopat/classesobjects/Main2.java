package neopat.classesobjects;

class OuterClass1 {
    class InnerClass {
        public void print() {
            System.out.print("This is an Inner Class");
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        OuterClass1.InnerClass in = new OuterClass1().new InnerClass();
        in.print();
    }
}

// You are using Java
// Method Local Inner Class
//class OuterClass {
//    void outerMethod() {
//        final String value = "Hello";
//        System.out.println("Outer Class: " + value);
//
//        class InnerClass {
//            public void print() {
//                System.out.println("InnerClass: " + value);
//            }
//        }
//        InnerClass in = new InnerClass();
//        in.print();
//    }
//
//}
//
//class Main {
//    public static void main(String[] args) {
//        OuterClass out = new OuterClass();
//        out.outerMethod();
//    }
//}