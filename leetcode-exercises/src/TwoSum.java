import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Brute Force approach
    // Complexity: O(n^2)
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++){
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                } 
            }

        }
        return new int[] {};
    }

    // One pass hash Approach
    // Complexity: O(n)
    public int[] twoSumHash(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}
