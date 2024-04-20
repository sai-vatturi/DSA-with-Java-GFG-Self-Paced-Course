package javakunalclass.oops.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human sai = new Human(34, "Sainadh Vatturi");
        Human twin = new Human(sai);
        Human twin2 = (Human) sai.clone();
        System.out.println(twin2.age);
    }
}
