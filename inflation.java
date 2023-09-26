import java.util.Arrays;
import java.util.Scanner;

public class inflation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[a];
        int[] arr2 = new int[a];
        double[] arr3 = new double[a];
        for (int i = 0; i < a; i++) {
            arr1[i] = i+1;
        }
        for (int i = 0; i < a; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);

        for (int i = 0; i < a; i++) {
            arr3[i] = arr2[i]/(double)arr1[i];
        }
        Arrays.sort(arr3);
        if(arr3[a-1] > 1){
            System.out.println("impossible");
        }
        else System.out.println(arr3[0]);
    }
}
