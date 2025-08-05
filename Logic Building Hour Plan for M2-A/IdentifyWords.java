import java.util.*;
public class IdentifyWords {
    public static List<String> findValidWords(String keys, List<String> words) {
        List<String> result = new ArrayList<>();
        Set<Character> keySet = new HashSet<>();
        for (char ch : keys.toCharArray()) {
            keySet.add(ch);
        }
        for (String word : words) {
            boolean isValid = true;
            for (char ch : word.toCharArray()) {
                if (!keySet.contains(ch)) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) result.add(word);
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> words = Arrays.asList("ace", "cab", "fade", "bed");
        System.out.println(findValidWords("abcde", words));
    }
}
