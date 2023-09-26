import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class tripodometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        HashSet<Integer> numbers = new HashSet<>();
        HashSet<Integer> sums = new HashSet<>();

        int sum = 0;
        for (int i = 0; i < testcases; i++) {
            int a = sc.nextInt();
            sum+=a;
            numbers.add(a);
        }
        for (int number:numbers){
            sums.add(sum-number);
        }
        ArrayList<Integer> sums_list = new ArrayList<>(sums);
        Collections.sort(sums_list);
        System.out.println(sums_list.size());
        for(int s:sums_list){
            System.out.print(s+" ");
        }
    }
}
