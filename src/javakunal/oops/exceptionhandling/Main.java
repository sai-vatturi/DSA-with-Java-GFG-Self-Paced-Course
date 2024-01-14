package javakunal.oops.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
//            int c  =  a / b;
//            divide(a, b);
            throw new ArithmeticException("Just mimicking");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("This will always run");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please do not divide by 0");
        }
        return a / b;
    }
}
