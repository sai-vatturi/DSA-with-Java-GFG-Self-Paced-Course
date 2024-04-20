package javakunalclass.oops.abstractDemo;

public class Main {
    // Abstract Classes Demo
    public static void main(String[] args) {
        Son son = new Son();
        son.career();
        son.partner();
        Daughter daughter = new Daughter();
        daughter.career();
        daughter.partner();
        Parent.hello();
    }
}
