
    /**
 * OOPS Banner App
 * UC7: Store Character Pattern in a Class
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class that encapsulates
     * a character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character Character to display
         * @param pattern 7 line banner pattern
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
     * Utility method to get character pattern
     * @param ch character to search
     * @param patterns array of CharacterPatternMap
     * @return pattern of character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {

        for (CharacterPatternMap p : patterns) {
            if (p.getCharacter() == ch) {
                return p.getPattern();
            }
        }
        return null;
    }

    /**
     * Utility method to print banner
     * @param word word to display
     * @param patterns stored character patterns
     */
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        StringBuilder[] bannerLines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {

            String[] pattern = getCharacterPattern(ch, patterns);

            if (pattern != null) {
                for (int i = 0; i < 7; i++) {
                    bannerLines[i].append(pattern[i]).append("  ");
                }
            }
        }

        for (StringBuilder line : bannerLines) {
            System.out.println(line);
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
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
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

        printBanner("OOPS", patterns);
    }
}