/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate
 * character-to-pattern mappings. The application retrieves and displays the "OOPS"
 * banner using these mappings. This approach enhances code organization and modularity.
 *
 * @author Developer
 * @version 7.0
 */

public class OOPSBannerApp {

    // Inner Static Class to hold character and its pattern
    static class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        // Updated patterns to ensure consistent width (7 spaces per row)
        CharacterPatternMap[] maps = new CharacterPatternMap[4];
        
        // 'O' pattern (Width: 7)
        maps[0] = new CharacterPatternMap('O', new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });
        
        // 'P' pattern (Width: 7)
        maps[1] = new CharacterPatternMap('P', new String[]{
            " *******",
            " **   **",
            " **   **",
            " *******",
            " **     ",
            " **     ",
            " **     "
        });
        
        // 'S' pattern (Width: 7)
        maps[2] = new CharacterPatternMap('S', new String[]{
            "  ****** ",
            " **      ",
            " **      ",
            "  ****** ",
            "       **",
            "       **",
            "  ****** "
        });

        return maps;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return charMaps[3].getPattern(); // Default to space
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int height = 7; // Height of patterns
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append("  "); // Add 2 spaces between letters
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        printMessage("OOPS", charMaps);
    }
}