package kansas2.o;

import java.util.Scanner;

public class HappyHappyPrimePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int i = 0; i < testcases; i++) {
            int k = sc.nextInt();
            int m = sc.nextInt();
            if(checkPrime(m)){
                if(m == 2 || m == 3){
                    System.out.println(k+" "+m+" NO");
                }
                else if(getHappy(m)){
                    System.out.println(k+" "+m+" YES");
                }
                else System.out.println(k+" "+m+" NO");
            }
            else {
                System.out.println(k+" "+m+" NO");
            }
        }
    }
    static boolean getHappy(int n){
        do {
            int sum = 0;
            while( n > 0 ) {
                int remainder = n % 10;
                n = n / 10;
                sum += remainder * remainder;
            }
            sum += n * n;
            n = sum;
        } while(n != 1 && n != 4);

        return n == 1;
    }
    static boolean checkPrime(int n){
        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for ( int i = 5; i * i <= n; i += 6 ) {
            if ( n % i == 0 || n % ( i + 2 ) == 0 )
                return false;
        }
        return true;
    }
}
