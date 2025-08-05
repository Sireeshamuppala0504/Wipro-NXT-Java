public class MostFrequentDigit {
    public static int findMostFrequentDigit(int[] nums) {
        int[] freq = new int[10];
        for (int num : nums) {
            while (num > 0) {
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }
        }
        int maxFreq = 0, result = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > maxFreq || (freq[i] == maxFreq && i < result)) {
                maxFreq = freq[i];
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {123, 145, 321, 999};
        System.out.println(findMostFrequentDigit(arr));
    }
}
