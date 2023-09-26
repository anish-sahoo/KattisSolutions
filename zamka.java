import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class zamka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.nextLine());
        int d = Integer.parseInt(sc.nextLine());
        int x = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = l; i <= d; i++) {
            if(getSum(i) == x)
                nums.add(i);
        }
        Collections.sort(nums);
        System.out.println(nums.get(0));
        System.out.println(nums.get(nums.size()-1));
    }
    static int getSum(int a){
        if(a==0)
            return 0;
        return a%10 + getSum(a/10);
    }
}
