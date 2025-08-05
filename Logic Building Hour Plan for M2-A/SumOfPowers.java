public class SumOfPowers {
    public static int computePowerSum(int number) {
        String numStr = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, i + 1);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(computePowerSum(123));
    }
}
