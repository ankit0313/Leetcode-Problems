# Problem: Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

# Problem link: https://leetcode.com/problems/remove-element/description/

# Solution to the problem

class Solution:
  def removeElement(self, nums: List[int], val: int) -> int:
    i = 0

    for num in nums:
      if num != val:
        nums[i] = num
        i += 1

    return i

# Time complexity: O(n)
# Space complexity: O(1)