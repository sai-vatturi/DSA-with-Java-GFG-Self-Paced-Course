package pat_training;

public class ReplaceFrequentCharacter {
    public static void main(String[] args) {
        String s = "aaabc";
        char ch = 'z';
        frequentCharacterReplaced(s, ch);
    }

    private static void frequentCharacterReplaced(String s, char ch) {
        int n = s.length();
        int[] chars = new int[26];

        for (int i = 0; i < n; i++) {
            char sch = s.charAt(i);
            int index = (int) sch - 'a';
            chars[index] = chars[index] + 1;
        }

        // find max
        int maxIndex = -1;
        int max = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] >= max) {
                max = chars[i];
                maxIndex = i;
            }
        }
        // replace characters
        char maxChar = (char) ((char) maxIndex + 'a');
        System.out.println(maxChar);

        s = s.replace(maxChar, ch);
        System.out.println(s);
    }
}
