import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        int len = nums.length;
        int[] out = new int[2];
        for(int i=0; i<len; i++){
            if(numbers.containsKey(target-nums[i])){
                out[0] = numbers.get(target-nums[i]);
                out[1] = i;
                return out;
            }
            numbers.put(nums[i], i);
        }
        return out;

    }
}

public class TwoSum{
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(arr, 22)));
    }
}