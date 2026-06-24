import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int p1 = 0;
        int p2 = 1;
        int arr_length = nums.length;
        while(p2 < arr_length){
            if (nums[p1] == 0) {
                while(nums[p2] == 0){
                    p2++;
                    if (p2 >= arr_length){
                        break;
                    }
                }
                if (p2 < arr_length){
                    nums[p1] = nums[p2];
                    nums[p2] = 0;
                    p1++;
                }
            }
            else{
                p1++;
                p2++;
            }
        }
    }
}

public class MoveZeroes{
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        Solution solution = new Solution();
        solution.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}