import java.util.Arrays;
public class SimpleEncodedArray {
    public static int[] encodeArray(int[] arr) {
        int[] result = new int[arr.length - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i] + arr[i + 1];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        System.out.println(Arrays.toString(encodeArray(input)));
    }
}
