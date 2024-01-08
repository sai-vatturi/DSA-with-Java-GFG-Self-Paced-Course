package javakunal.oops.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;
    BoxPrice(){
        super();
        this.cost = -1;

    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost = -1;
    }
    BoxPrice(double side, double price){
        super(side, 2);
        this.cost = price;
    }
}
