import java.util.*;

public class landlocked2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        HashMap<String, Integer> ansMap = new HashMap<>();

        for(int i=0; i<n; i++) {
            String[] item = sc.nextLine().split("");
            /*for (int j=0; j<item.length; j++) {
                if(j>0){
                    if(item[j-1].equals("W") && !item[j].equals("W")){
                        ansMap.put(item[j],0);
                    }
                }
                if(j<item.length-1){
                    if(item[j+1].equals("W") && !item[j].equals("W")){
                        ansMap.put(item[j],0);
                    }
                }
            }*/
            for (int k = 0; k < m/2; k++) {
                for (int j=0; j<item.length; j++) {
                    if(j > k+1){
                        if(item[j-1-k].equals("W") && !item[j].equals("W")){
                            if(!ansMap.containsKey(item[j]))
                                ansMap.put(item[j],k);
                        }
                    }
                    if(j<item.length-1-k){
                        if(item[j+1+k].equals("W") && !item[j].equals("W")){
                            if(!ansMap.containsKey(item[j]))
                                ansMap.put(item[j],k);
                        }
                    }
                }
            }
        }

        ArrayList<String> answerKeyList = new ArrayList<>(ansMap.keySet());
        Collections.sort(answerKeyList);

        for(String a:answerKeyList){
            System.out.println(a+" "+ansMap.get(a));
        }
    }
}
