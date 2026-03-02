public class OOPSBannerApp {

    // Method to generate pattern for 'O'
    public static String[] getOPattern() {
        return new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        };
    }

    // Method to generate pattern for 'P'
    public static String[] getPPattern() {
        return new String[]{
                " ***** ",
                " *   * ",
                " *   * ",
                " ***** ",
                " *     ",
                " *     ",
                " *     "
        };
    }

    // Method to generate pattern for 'S'
    public static String[] getSPattern() {
        return new String[]{
                "  *****",
                " *     ",
                " *     ",
                "  **** ",
                "      *",
                "      *",
                " ***** "
        };
    }

    // Main method
    public static void main(String[] args) {

        // Call methods to get patterns
        String[] oPattern1 = getOPattern();
        String[] oPattern2 = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop to print banner line by line
        for (int i = 0; i < oPattern1.length; i++) {
            System.out.println(
                    oPattern1[i] + "  " +
                    oPattern2[i] + "  " +
                    pPattern[i] + "  " +
                    sPattern[i]
            );
        }
    }
}