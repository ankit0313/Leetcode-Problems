/*
    PROBLEM STATEMENT:-

    The heads of two singly linked-lists headA and headB are given, and we need to return the node at which the two lists intersect. 
    If the two linked lists have no intersection at all, return null.
*/


public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode a=headA;
        ListNode b=headB;
        
        while(a!=b)
        {
            a= a==null?headB:a.next; // if linked list A is done traversing -> move to linked list B
            
            b= b==null?headA:b.next; // if linked list B is done traversing -> move to linked list A
        }
        return a;
    }
}

public class ListNode 
{
      int val;
      ListNode next;
      ListNode(int x) 
      {
          val = x;
          next = null;
      }
  }