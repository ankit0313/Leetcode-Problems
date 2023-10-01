class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

      int n=nums.length;
      int res[]=new int[n-k+1];
      Deque<Integer>deque=new LinkedList<>();

      for(int i=0;i<k;i++){
          while(!deque.isEmpty() && nums[i]>=nums
[deque.peekLast()])
            deque.removeLast();
            deque.addLast(i);
      }

      int j=0;
      for(int i=k;i<n;i++){
          res[j]=nums[deque.peek()];
          while(!deque.isEmpty() && deque.peek()<i-k+1)
            deque.removeFirst();

         while(!deque.isEmpty() && nums[i]>=nums[deque.peekLast()])
           deque.removeLast();
           deque.addLast(i);
          
        j++;
      }
       res[j]=nums[deque.peek()];
       return res;
    }
}