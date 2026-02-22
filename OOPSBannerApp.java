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
        
        // 1. Array Creation: Create an empty String array to hold the 7 banner lines
        String[] bannerLines = new String[7];

        // 2. Array Population: Populate each index using String.join()
        bannerLines[0] = String.join(" ", "   ***   " , "   ***   " , " ******* " , "  ****** ");
        bannerLines[1] = String.join(" ", " **   ** " , " **   ** " , "**     **" , "**       ");
        bannerLines[2] = String.join(" ", "**     **" , "**     **" , "**     **" , "**       ");
        bannerLines[3] = String.join(" ", "**     **" , "**     **" , "******** " , "  ****** ");
        bannerLines[4] = String.join(" ", "**     **" , "**     **" , "**       " , "       **");
        bannerLines[5] = String.join(" ", " **   ** " , " **   ** " , "**       " , "**     **");
        bannerLines[6] = String.join(" ", "   ***   " , "   ***   " , "**       " , "  ****** ");

        // 3. Loop Iteration: Use an enhanced for-each loop to print each line sequentially
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}