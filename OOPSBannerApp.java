/**
 * OOPS Banner App - UC7
 * Demonstrates storing character banner patterns using an Inner Static Class
 * and displaying the word OOPS in banner format.
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class to encapsulate a character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character the character represented
         * @param pattern 7-line banner pattern for the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return banner pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern of a character
     * @param c input character
     * @param patterns array of CharacterPatternMap
     * @return pattern of the character
     */
    public static String[] getCharacterPattern(char c, CharacterPatternMap[] patterns) {

        for (CharacterPatternMap p : patterns) {
            if (p.getCharacter() == c) {
                return p.getPattern();
            }
        }
        return null;
    }

    /**
     * Utility method to display banner
     * @param word word to print
     * @param patterns array containing character patterns
     */
    public static void displayBanner(String word, CharacterPatternMap[] patterns) {

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        for (char c : word.toCharArray()) {

            String[] charPattern = getCharacterPattern(c, patterns);

            if (charPattern != null) {
                for (int i = 0; i < 7; i++) {
                    banner[i].append(charPattern[i]).append("  ");
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

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        displayBanner("OOPS", patterns);
    }
}