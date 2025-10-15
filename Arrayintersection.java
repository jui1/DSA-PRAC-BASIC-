import java.util.*;

public class Arrayintersection {
    
 public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 6};

        int[] result = findIntersection(arr1, arr2);
        System.out.println("Intersection: " + Arrays.toString(result));
    }

    public static int[] findIntersection(int[] arr1, int[] arr2) {
    HashMap<Integer, Integer> ans = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();

    for(int cb : arr1){
        ans.put(cb, ans.getOrDefault(cb, 0)+1);
    }

    for(int cb : arr2){
        
        if(ans.containsKey(cb) && ans.get(cb)>0){
            list.add(cb);
       ans.put(cb, ans.getOrDefault(cb, 0)+1);
        }
    }

    int [] result = new int [list.size()];
    for(int i = 0 ;i<list.size();i++){
        result[i] = list.get(i);


    }

    


        
        // 👉 Write your logic here
        // You can use HashMap, two-pointer approach (if sorted), or HashSet
        return result; // temporary placeholder
    }
}
