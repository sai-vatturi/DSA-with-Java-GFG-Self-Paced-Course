package javakunal.oops.customarraylist;

public class Main {
    public static void main(String[] args) {
//        CustomArrayList arr = new CustomArrayList();
////        arr.add(5);
////        arr.set(4, 2);
////        arr.print();
//        for(int i = 0; i < 14; i++){
//            arr.add(i*2);
//        }
//        System.out.println(arr);

        CustomGenArrayList<String> lis2 = new CustomGenArrayList<>();
        for(int i = 0; i < 18; i++){
            lis2.add(String.valueOf(i * 2));
        }

        System.out.println(lis2);
    }
}
