import java.util.Scanner;

public class jumbojavelin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int sum=0;
        for (int i = 0; i < a; i++) {
            sum += Integer.parseInt(sc.nextLine());
        }
        System.out.println(sum-a+1);
    }
}
