/**
 * OOPSBannerApp - Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
 * such as the Collections Framework to manage character patterns in a more flexible
 * and efficient manner. The application retrieves and displays the "OOPS" banner
 * using a HashMap there by enhancing code organization and modularity.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     *
     * @return A HashMap where keys are characters (char) and values are String arrays
     * representing the ASCII art pattern lines.
     */
    public static Map<Character, String[]> createCharacterMap() {
        Map<Character, String[]> charMap = new HashMap<>();

        // Populate charMap with patterns for 'O', 'P', 'S', and space
        charMap.put('O', new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });
        charMap.put('P', new String[]{
            " *******",
            " **   **",
            " **   **",
            " *******",
            " **     ",
            " **     ",
            " **     "
        });
        charMap.put('S', new String[]{
            "  ****** ",
            " **      ",
            " **      ",
            "  ****** ",
            "       **",
            "       **",
            "  ****** "
        });
        

        return charMap;
    }

    
    public static void displayBanner(String message, Map<Character, String[]> charMap) {
        // Assume all patterns have the same height based on the first key's length
        int patternHeight = charMap.get('O').length;

        // Loop through each line of the pattern height
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            
            // Inner loop for each character for constructing multi-line banner output
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                if (pattern != null) {
                    // Efficient string concatenation using StringBuilder
                    sb.append(pattern[line]).append("  "); // Add space between characters
                }
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        // Generate the HashMap of characters and Patterns
        Map<Character, String[]> charMap = createCharacterMap();
        
        String message = "OOPS";
        
        // Render the Banner Message
        displayBanner(message, charMap);
    }
}