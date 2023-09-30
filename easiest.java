import java.util.ArrayList;
import java.util.Scanner;

public class easiest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            int a = Integer.parseInt(sc.nextLine());
            if(a==0)
                break;
            list.add(a);
        }
        for(int a:list){
            for (int i = 11; i < 1000; i++) {
                //System.out.println(i+"\t"+getSum(a*i)+"\t"+getSum(a));
                if(getSum(i*a) == getSum(a)){
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    static int getSum(int a){
        if(a==0)
            return 0;
        return a%10 + getSum(a/10);
    }
}
