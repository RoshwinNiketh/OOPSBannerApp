/**
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 * @author Developer
 * @version 4
 */

// Extend the user story 3 to further develop the OOPS Banner Application
// by using String arrays to hold banner lines and printing them in a loop.
// This use case improves upon UC3 by using a String array to store banner lines
// and iterating through them with a for-each loop, eliminating hardcoded print
// statements and improving modularity and reusability.

public class OOPSBannerApp {

    // Main method to run the banner display
    // Construct each line using String.join() method and store in an array.
    // Use an enhanced for loop to print the banner for better modularity.
    public static void main(String[] args) {
        
        String[] lines = { String.join(" ", "   ***   " , "   ***   " , " ******* " , "  ****** "),
                        String.join(" ", " **   ** " , " **   ** " , "**     **" , "**       "),
                        String.join(" ", "**     **" , "**     **" , "**     **" , "**       "),
                        String.join(" ", "**     **" , "**     **" , "******** " , "  ****** "),
                        String.join(" ", "**     **" , "**     **" , "**       " , "       **"),
                        String.join(" ", " **   ** " , " **   ** " , "**       " , "**     **"),
                        String.join(" ", "   ***   " , "   ***   " , "**       " , "  ****** ")};

        // 3. Loop Iteration: Use an enhanced for-each loop to print each line sequentially
        for (String line : lines) {
            System.out.println(line);
        }
    }
}