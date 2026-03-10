import java.util.HashMap;
import java.util.Map;

public class HelloApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        renderBanner("OOPS", patternMap);
    }

    public static void renderBanner(String word, Map<Character, String[]> map) {

        int height = 5;

        StringBuilder[] banner = new StringBuilder[height];

        for (int i = 0; i < height; i++) {
            banner[i] = new StringBuilder();
        }

        for (char c : word.toCharArray()) {

            String[] pattern = map.get(c);

            if (pattern != null) {

                for (int i = 0; i < height; i++) {
                    banner[i].append(pattern[i]).append(" ");
                }

            }
        }

        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }
}