
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }

        int[] charCounts = new int[256];

        for (char c : str.toCharArray()) {
            charCounts[c]++;
        }

        int maxCount = -1;
        char mostCommonChar = ' ';

        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > maxCount) {
                maxCount = charCounts[i];
                mostCommonChar = (char) i;
            }
        }
        return mostCommonChar;
    }
}
