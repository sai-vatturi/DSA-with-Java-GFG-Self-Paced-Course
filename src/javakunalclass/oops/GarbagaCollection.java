package javakunalclass.oops;

public class GarbagaCollection {
    public static void main(String[] args) {
        A a;
        for(int i = 0;i < 1000000000; i++){
            a = new A("Sai");
        }
    }
}

class A{
    final int a = 10;
    String name;
    A (String name){
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Distroyed");
    }
}
