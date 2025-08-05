import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n % 2 == 0 ? "EVEN" : "ODD");
        s.close();
    }
}