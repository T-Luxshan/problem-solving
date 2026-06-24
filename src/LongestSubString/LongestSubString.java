import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int longest = 0;
        HashSet<Character> set = new HashSet<>();
        while(right<s.length()){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left +=1;
            }
            set.add(s.charAt(right));
            longest = Math.max(longest, right-left+1);
            right++;
        }
        return longest;
    }
}

public class LongestSubString{
    public static void main(String[] args){
            String s = "abcabcbb";
            Solution solution = new Solution();
            System.out.println(solution.lengthOfLongestSubstring(s));
            }
        }