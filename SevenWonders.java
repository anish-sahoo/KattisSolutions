import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int t=0, c=0, g=0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == 'T')
                t++;
            if(a.charAt(i) == 'C')
                c++;
            if(a.charAt(i) == 'G')
                g++;
        }

        int points = t*t + c*c + g*g;
        points += Math.min(Math.min(t,c),g)*7;
        System.out.println(points);
    }
}

//nicer way to do the first for-loop using ternary operators:
//  t += (a.charAt(i)=='T')? 1:0;
//  c += (a.charAt(i)=='C')? 1:0;
//  t += (a.charAt(i)=='T')? 1:0;