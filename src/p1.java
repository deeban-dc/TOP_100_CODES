import java.util.Scanner;
// Positive or Negative number
public class p1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int num = in.nextInt();
            if (num > 0) System.out.println("Positive");
            else if (num < 0) System.out.println("Negative");
            else System.out.println("zero");
        }
    }
}
