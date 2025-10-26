
public class Main {
    public static void main(String[] args) {
        // Sample input
        int[] height = {1,8,6,2,5,4,8,3,7};

        // Create Solution object
        Solution sol = new Solution();
        int result = sol.maxArea(height);

        // Print result
        System.out.println("Maximum water: " + result);
    }
}

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;

            // Update max area
            max = Math.max(max, area);

            // Move the pointer of smaller height
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
