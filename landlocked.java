import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class landlocked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> ans = new HashMap<>();
        for(int i=0; i<n; i++) {
            String[] item = sc.nextLine().split("");
            System.out.println(Arrays.toString(item));
            for(int j=0; j<m; j++) {
                if(j!=0 && item[j] != "W" && item[j-1] == "W") {
                    ans.put(item[j], 0);
                    for(int k=0; k<m; k++) {
                        if(item[k] == item[j])
                            item[k] = "0";
                    }

                }
                if(j!=m-1 && item[j] != "W" && item[j+1] == "W") {
                    ans.put(item[j], 0);
                    for(int k=0; k<m; k++) {
                        if(item[k] == item[j])
                            item[k] = "0";
                    }
                }
            }

            for(int a=0; a<n*m; a++) {
                for(int j=0; j<m; j++) {
                    if(j!=0 && item[j] != a+"" && item[j-1] == a+"") {
                        ans.put(item[j], a+1);
                        for(int k=0; k<m; k++) {
                            if(item[k] == item[j])
                                item[k] = a+1+"";
                        }

                    }
                    if(j!=m-1 && item[j] != a+"" && item[j+1] == a+"") {
                        ans.put(item[j], a+1);
                        for(int k=0; k<m; k++) {
                            if(item[k] == item[j])
                                item[k] = a+1+"";
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
