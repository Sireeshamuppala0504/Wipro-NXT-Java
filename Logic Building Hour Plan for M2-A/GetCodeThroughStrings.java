public class GetCodeThroughStrings {
    public static String generateCode(String input) {
        String[] words = input.split("\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            int mid = word.length() / 2;
            result.append(word.charAt(mid));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(generateCode("hello world java"));
    }
}
