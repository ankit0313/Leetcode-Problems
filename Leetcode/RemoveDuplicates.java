class RemoveDuplicates {
  public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
// Logic of above code - 
//If the current element nums[i] is not equal to the previous element nums[i - 1], it means we have encountered a new unique element.
//In that case, we update nums[j] with the value of the unique element at nums[i], and then increment j by 1 to mark the next position for a new unique element.
//By doing this, we effectively overwrite any duplicates in the array and only keep the unique elements.
