import java.util.*;

public class HelloApp {

    // Static Inner Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Store character patterns
        List<CharacterPatternMap> patterns = new ArrayList<>();

        patterns.add(new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patterns.add(new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        patterns.add(new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        String word = "OOPS";

        StringBuilder[] banner = new StringBuilder[5];
        for (int i = 0; i < 5; i++) {
            banner[i] = new StringBuilder();
        }

        for (char c : word.toCharArray()) {

            for (CharacterPatternMap cp : patterns) {

                if (cp.getCharacter() == c) {

                    String[] p = cp.getPattern();

                    for (int i = 0; i < 5; i++) {
                        banner[i].append(p[i]).append(" ");
                    }

                }
            }
        }

        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }
}