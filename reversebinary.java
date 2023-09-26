import java.util.Scanner;

public class reversebinary {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        String flipped = new StringBuilder(Integer.toBinaryString(a)).reverse().toString();
        System.out.println(Integer.parseInt(flipped,2));
    }
}
