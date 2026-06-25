class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max_window_size = 0.0;
        for(int i=0; i<k; i++) {
            max_window_size += nums[i];
        }
        // double max_window_avg = max_window_size/k;
        double new_window_size = max_window_size;
        for(int i=k; i<nums.length; i++ ){
            new_window_size = (new_window_size + nums[i] - nums[i-k]);
            if (new_window_size > max_window_size) {
                max_window_size = new_window_size;
            }
        }
        return max_window_size/k;
    }
}

public class MaxAvgSubarray {
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        Solution solution = new Solution();
        System.out.println(solution.findMaxAverage(arr, k));
    }
}
