package javakunalclass.oops.inheritance;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(BoxWeight old){
        super(old);
        this.weight = old.weight;
    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
    BoxWeight(double l, double h, double w, double weight){
        super(l,w,h);
        this.weight = weight;
    }
}
