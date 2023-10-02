class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}

//The logic of this code is to check if there are any duplicate elements in the given array nums. 
//It does this by first sorting the array in ascending order using Arrays.sort(nums). 
//Then, it iterates through the sorted array and compares each element with the previous element. 
//If it finds any two adjacent elements that are equal, it returns true indicating the presence of duplicates. 
//If no duplicates are found during the iteration, it returns false. 
