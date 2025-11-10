import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] val = new List[nums.length + 1];

        // Step 1: Count frequencies
        for (int ch : nums) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Frequency Map: " + map);

        // Step 2: Bucket sort by frequency
        for (int key : map.keySet()) {
            int frq = map.get(key);
            if (val[frq] == null) {
                val[frq] = new ArrayList<>();
            }
            val[frq].add(key);
        }

        // Print buckets
        System.out.println("Buckets (frequency -> numbers):");
        for (int i = 0; i < val.length; i++) {
            if (val[i] != null) {
                System.out.println(i + " -> " + val[i]);
            }
        }

        int[] res = new int[k];
        int count = 0;

        // Step 3: Collect top k frequent elements
        for (int i = val.length - 1; i >= 0; i--) {
            if (val[i] != null) {
                for (Integer ing : val[i]) {
                    res[count++] = ing;
                    System.out.println("Adding " + ing + " to result array. Count = " + count);
                    if (count == k) return res; // stop when we have k numbers
                }
            }
        }

        return res;
    }

    // Main method for testing
    public static void main(String[] args) {
        TopKFrequentElements sol = new TopKFrequentElements();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = sol.topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
    }
}
