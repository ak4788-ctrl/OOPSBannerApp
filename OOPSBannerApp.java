import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        }));

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(patternMap.get(c).getPattern()[i] + "  ");
            }
            System.out.println();
        }
    }
}