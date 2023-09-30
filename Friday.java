import java.util.ArrayList;
import java.util.Scanner;

public class Friday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            int d = sc.nextInt(); //D - no of days in year
            int m = sc.nextInt(); //M - no of months in year
            sc.nextLine();

            ArrayList<Integer> monthSizes = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                monthSizes.add(sc.nextInt());
            }
            sc.nextLine();

            int count = 0, current_day_of_week = 1;

            for (int month = 0; month < m; month++) {
                for (int date = 1; date <= monthSizes.get(month); date++) {
                    if(date == 13 && current_day_of_week == 6){
                        count++;
                    }
                    current_day_of_week = (current_day_of_week % 7) + 1;
                }
            }
            System.out.println(count);
        }
    }
}

/*
1 - Sunday
2 - Monday
3 - Tuesday
4 - Wednesday
5 - Thursday
6 - kansas2.o.Friday
7 - Saturday
 */