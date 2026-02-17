/**
 * OOPSBannerApp UC2 - Banner Display Application
 *
 * This class demonstrates the creation of a visual banner displaying the word "OOPS"
 * using ASCII art composed of asterisks (*) and spaces. The banner is printed to the
 * console using individual print statements for each line.
 *
 * @author Developer
 * @version 2.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Each letter is 7 lines tall and width is 9 characters.
        // We print O O P S side-by-side using string concatenation.

        System.out.println("   ***   " + "   ***   " + "  *****  " + "  *****  ");
        System.out.println(" **   ** " + " **   ** " + " **   ** " + " **      ");
        System.out.println("**     **" + "**     **" + " **   ** " + " **      ");
        System.out.println("**     **" + "**     **" + "  *****  " + "  *****  ");
        System.out.println("**     **" + "**     **" + " **      " + "      ** ");
        System.out.println(" **   ** " + " **   ** " + " **      " + "      ** ");
        System.out.println("   ***   " + "   ***   " + " **      " + "  *****  ");
    }
}
