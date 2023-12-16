package javakunalclass.linearseach;

public class LinearSearchString {
    public static void main(String[] args) {
        String name = "Sai";
        char target = 'S';
        System.out.println(linearSearchString(name, target));
        System.out.println(linearSearchString2(name, target));
        System.out.println(linearSearchString3(name, target));
    }

    public static boolean linearSearchString(String name, char target) {
        if(name.isEmpty()){
            return false;
        }
        for(int i = 0;  i < name.length(); i++){
            if(name.charAt(i)== target) {
                return true;
            }
        }
        return false;

    }
    public static int linearSearchString2(String name, char target) {
        if(name.isEmpty()){
            return -1;
        }
        for(int i = 0;  i < name.length(); i++){
            if(name.charAt(i)== target) {
                return i;
            }
        }
        return -1;

    }

    public static boolean linearSearchString3(String name, char target) {
        if(name.isEmpty()){
            return false;
        }
        for(char ch : name.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }


}
