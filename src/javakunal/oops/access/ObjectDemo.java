package javakunal.oops.access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(12,42.34f);
        ObjectDemo obj2 = new ObjectDemo(12,45.34f);
        if(obj == obj2){
            System.out.println("obj 1 and 2 are equal");
        }
        if(obj.equals(obj2)){
            System.out.println("obj 1 and 2 are equal");
        }
        System.out.println(obj.getClass().getName());
    }
}
