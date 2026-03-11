\import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8
 * Demonstrates storing banner character patterns using HashMap
 * and rendering the word OOPS.
 */
public class OOPSBannerApp {

    /**
     * Utility method to build and return the map of character patterns
     * @return Map containing character patterns
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    /**
     * Utility method to display banner message
     * @param word banner text
     * @param patternMap map containing character patterns
     */
    public static void displayBanner(String word, Map<Character, String[]> patternMap) {

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {

            String[] pattern = patternMap.get(ch);

            if (pattern != null) {
                for (int i = 0; i < 7; i++) {
                    banner[i].append(pattern[i]).append("  ");
                }
            }
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(banner[i]);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatterns();

        String word = "OOPS";

        displayBanner(word, patternMap);
    }
}