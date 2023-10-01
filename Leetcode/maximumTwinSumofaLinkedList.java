//2130. Maximum Twin Sum of a Linked List




/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        //Approach: Using Extra Space
        //Use a array to store the elements
        int[] arr = new int[100000];
        int index = 0;
        while(head!=null){
            arr[index++] = head.val;
            head = head.next;
        }
        //initialize the maxSum and traverse half through the array
        int maxSum = 0;
        for(int i=0;i<index/2;i++){
            //calculate twin sum
            int twinSum = arr[i]+arr[index-1-i];

            //update the max Sum
            maxSum = Math.max(maxSum, twinSum);
        }
        return maxSum;
    }
}