
import java.util.HashMap;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 6, 6};

        findDuplicates(arr);
    }
    public static void findDuplicates(int[] arr) {
        HashMap<Integer , Integer> ans = new HashMap<>();
        for(int ch : arr){
            ans.put(ch, ans.getOrDefault(ch, 0)+1);
        }
for(int pp : ans.keySet() ){
    if(ans.get(pp)>1){
        System.out.print(pp + " ");
    }

}
        

    }

}
