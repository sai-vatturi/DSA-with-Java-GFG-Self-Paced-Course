package pat_training;

public class ReverseStringWithoutNumbers {
    public static void main(String[] args) {
        String str = "Ab5c7de96";
        reverseStringWithoutAlteringNumbers(str);
    }
    public static void reverseStringWithoutAlteringNumbers(String str) {
        int n = str.length();
        int start = 0;
        int end = n - 1;
        StringBuilder result = new StringBuilder(str);
        while (start < end) {
            if (str.charAt(start) >= '0' && str.charAt(start) <= '9') {
                start++;
                continue;
            }
            if (str.charAt(end) >= '0' && str.charAt(end) <= '9') {
                end--;
                continue;
            }
            char temp = str.charAt(start);
            result.setCharAt(start, str.charAt(end));
            result.setCharAt(end, temp);
            start++;
            end--;
        }
        System.out.println(result);
    }
}
