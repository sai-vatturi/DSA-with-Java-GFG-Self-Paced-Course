package javakunalclass.oops.interfaces.nestedinterfaces;

public class Main {
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}
class B implements Main.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
