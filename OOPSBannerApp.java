import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Create map storing character patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    // Initialize patterns
    static void initializePatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });
    }

    // Function to render banner
    static void renderBanner(String word) {

        for (int row = 0; row < 7; row++) {

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);

                System.out.print(pattern[row] + "  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        initializePatterns();

        String word = "OOPS";

        renderBanner(word);
    }
}