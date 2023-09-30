import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class joinstrings { //too slow
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n-1; i++) {
            String[] nums = br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            sb.append(s[a-1]);
            sb.append(s[b-1]);
            s[a-1] = sb.toString();
            sb.setLength(0);
            s[b-1] = "";
        }
        for (String str : s) {
            System.out.print(str);
        }
    }
}