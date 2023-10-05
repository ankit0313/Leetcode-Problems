class Solution {
    public int[] productExceptSelf(int[] nums) {
        int numlength=nums.length;
        int ans[]=new int[numlength];
        for (int i = 0; i < numlength; i++){
            int prod=1;
            for(int j = 0; j < numlength; j++) {
                 if(i == j) continue;
                prod*= nums[j];
            }
            ans[i] = prod;

        }
        return ans;
    }
}