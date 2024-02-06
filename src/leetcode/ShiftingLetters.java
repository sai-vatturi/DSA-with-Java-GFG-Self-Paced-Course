package leetcode;

class ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        // Convert the input string to a character array
        char[] res = s.toCharArray();

        // Initialize a variable to keep track of cumulative shifts
        int cumulativeShift = 0;

        // Iterate through the shifts array in reverse order
        for (int i = shifts.length - 1; i >= 0; i--) {
            // Update the cumulative shift by adding the current shift value
            cumulativeShift = (cumulativeShift + shifts[i]) % 26;

            // Update the character at index i by shifting it using the shift method
            res[i] = shift(res[i], cumulativeShift);
        }

        // Convert the modified character array back to a string and return it
        return new String(res);
    }

    // Helper method to shift a character by a given number of positions
    public char shift(char ch, int n) {
        // Convert the character to its corresponding alphabetical index ('a' becomes 0, 'b' becomes 1, and so on)
        // Shift the index by the specified number of positions, and take the result modulo 26 to ensure it stays within the alphabet range
        // Convert the shifted index back to a character by adding 'a'
        return (char) ((ch - 'a' + n) % 26 + 'a');
    }
}
