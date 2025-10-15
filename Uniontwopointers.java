import java.util.*;

public class Uniontwopointers {
    public static void main(String[] args) {
   int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 3, 5, 6};

        int[] result = findUnion(arr1, arr2);
        System.out.println("Union using HashSet: " + Arrays.toString(result));
    }

    public static int[] findUnion(int[] arr1, int[] arr2) {
          HashSet<Integer> ans = new HashSet<>();

        for(int um : arr1){
            ans.add(um);
        }

        for(int pp : arr2){
            ans.add(pp);
        }



        int [] res= new int [ans.size()];
        int i = 0 ;
        for(int num: ans){
            res[i++] = num;

        }

        return res;

    }
    
}
