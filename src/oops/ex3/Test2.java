package oops.ex3;

class Billing {
    double computeBill(int price) {
        return (double) price + (price * 8.0 / 100);
    }

    double computeBill(int price, int quantity) {
        double  totalPrice = price * quantity;
        return (double) totalPrice + (totalPrice * 8.0 / 100);
    }

    double computeBill(int price, int quantity, int discount) {
        double beforeDiscount = price * quantity;
        double afterDiscount = beforeDiscount - discount;
        return (double) afterDiscount + (afterDiscount * 8.0 / 100);
    }
}
public class Test2 {
    public static void main(String[] args) {
        Billing bill = new Billing();
        System.out.println(bill.computeBill(99));
        System.out.println(bill.computeBill(100, 5));
        System.out.println(bill.computeBill(50, 10, 200));
    }
}
