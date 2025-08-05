public class FindStringCode {
    public static String getCode(String input) {
        String[] words = input.split("\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            int code;
            if (word.length() >= 2)
                code = Math.abs(word.charAt(0) - word.charAt(word.length() - 1));
            else
                code = word.charAt(0);
            result.append(code);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(getCode("abc xyz"));
    }
}
