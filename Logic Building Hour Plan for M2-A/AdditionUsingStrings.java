public class AdditionUsingStrings {
    public static String addStrings(String num1, String num2) {
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        return Integer.toString(sum);
    }
    public static void main(String[] args) {
        System.out.println(addStrings("123", "456"));
    }
}
