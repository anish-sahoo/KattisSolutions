import java.util.Arrays;
import java.util.Scanner;

public class notes {
    static int getGCD(int a, int b) {
        int gcd = 1;
        for(int i = 1; i <= a && i <= b; ++i) {
            if(a % i == 0 && b % i == 0)
                gcd = i;
        }
        int lcm = (a * b) / gcd;
        return gcd;
    }
    static int findGcd(int x, int y) {
        if (x == 0)
            return y;
        return findGcd(y % x, x);
    }
    static int findLcm(int x, int y) {
        return (x / findGcd(x, y)) * y;
    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static int findGCD(int[] arr) {
        if (arr.length == 1)
            return arr[0];
        int result = gcd(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            result = gcd(result, arr[i]);
            if (result == 1)
                return 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}

