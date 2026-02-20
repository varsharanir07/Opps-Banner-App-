public class OOPSBannerApp{

    public static void main(String[] args) {

        // Inline declaration + initialization + population
        String[] banner = {
                String.join("   ", " ***** ", " ***** ", " ******", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*      "),
                String.join("   ", "*     *", "*     *", "*     *", "*      "),
                String.join("   ", "*     *", "*     *", "****** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*      ", "      *"),
                String.join("   ", "*     *", "*     *", "*      ", "      *"),
                String.join("   ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        // Enhanced for loop for clean traversal
        for (String line : banner) {
            System.out.println(line);
        }
    }
}