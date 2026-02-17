/**
 * OOPSBannerApp
 *
 * UC3: Render OOPS as Banner using String.join()
 * Refactored version of UC2 to improve memory efficiency
 * and readability using String.join() instead of + operator.
 *
 * @author Varsha
 * @version 3.0
 */
public class OOPSBannerApp {

    /**
     * Main method - Entry point of the application
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Line 1
        System.out.println(String.join(" ",
                " ******* ",
                " ******* ",
                " ******* ",
                " ******* "));

        // Line 2
        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *       "));

        // Line 3
        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *       "));

        // Line 4
        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " ******* ",
                " ******* "));

        // Line 5
        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "       * "));

        // Line 6
        System.out.println(String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "       * "));

        // Line 7
        System.out.println(String.join(" ",
                " ******* ",
                " ******* ",
                " *       ",
                " ******* "));
    }
}

