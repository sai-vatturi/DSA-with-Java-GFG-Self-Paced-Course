package javakunal.oops.inheritance;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(double weight){
        this.weight = weight;
    }
    BoxWeight(double l, double h, double w, double weight){
        super(l,w,h);
        this.weight = weight;
    }
}
