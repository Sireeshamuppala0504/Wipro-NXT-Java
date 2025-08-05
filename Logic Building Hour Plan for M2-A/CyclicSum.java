public class CyclicSum {
    public static int cyclicDigitSum(int number) {
        String numStr = Integer.toString(number);
        int total = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int sum = 0;
            for (int j = 0; j < numStr.length(); j++) {
                sum += Character.getNumericValue(numStr.charAt((i + j) % numStr.length()));
            }
            total += sum;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(cyclicDigitSum(123));
    }
}
