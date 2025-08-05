public class EncodeThreeStrings {
    public static String encode(String s1, String s2, String s3) {
        char c1 = s1.charAt(0), c2 = s2.charAt(0), c3 = s3.charAt(0);
        char m1 = s1.charAt(s1.length() / 2), m2 = s2.charAt(s2.length() / 2), m3 = s3.charAt(s3.length() / 2);
        char e1 = s1.charAt(s1.length() - 1), e2 = s2.charAt(s2.length() - 1), e3 = s3.charAt(s3.length() - 1);
        return "" + c1 + c2 + c3 + m1 + m2 + m3 + e1 + e2 + e3;
    }
    public static void main(String[] args) {
        System.out.println(encode("apple", "brave", "clear"));
    }
}
