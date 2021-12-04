//https://leetcode.com/problems/max-consecutive-ones-iii/


class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = -1;
        int j = -1;
        int cz = 0;
        int ans = 0;

        while(i <  nums.length-1) {
            //aquire
            while(i < nums.length-1) {
                i++;
                
                if(nums[i] == 0) {
                    cz++;
                }

                if(cz <= k) {
                    int len = i - j;
                    ans = Math.max(ans,len);
                }
                else {
                    //invalid
                    break;
                }

            }

            //release
            while(j < i && cz > k) {
                j++;

                if(nums[j] == 0) {
                    cz--;
                }
            }
        }

        return ans;
 
    }
}