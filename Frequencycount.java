import java.util.*;

public class Frequencycount {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 3, 2};

        countFrequency(arr);
    }

    public static void countFrequency(int[] arr) {
        // Step 1: Create a HashMap to store element → frequency
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Step 2: Loop through array and update frequency
        for (int num : arr) {
            // Write your logic here
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

        }

        // Step 3: Print frequency
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
        }
    }
}
