// UC5 Implementation
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Declare + Initialize array in one step
        String[] lines = {
            String.join(" ", " *** ", " *** ", " ***** ", " ***** "),
            String.join(" ", "*   *", "*   *", "*     ", "*     "),
            String.join(" ", "*   *", "*   *", "*     ", "*     "),
            String.join(" ", "*   *", "*   *", " *****", " *****"),
            String.join(" ", "*   *", "*   *", "     *", "     *"),
            String.join(" ", "*   *", "*   *", "     *", "     *"),
            String.join(" ", " *** ", " *** ", " *****", " *****")
        };

        // Step 2: Loop to print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}