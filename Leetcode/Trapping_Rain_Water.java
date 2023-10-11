/*
Problem Name : Trapping Rain Water
Problem Link : https://leetcode.com/problems/trapping-rain-water/
*/

class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int res = 0;
        int[] lmax = new int[n], rmax = new int[n];
        
        // Calculate the maximum height to the left of each bar
        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], arr[i]);
        }
        
        // Calculate the maximum height to the right of each bar
        rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(arr[i], rmax[i + 1]);
        }
        
        // Calculate the trapped rainwater for each bar
        for (int i = 0; i < n; i++) {
            // The amount of trapped water at the current bar is determined
            // by the minimum of the maximum heights to the left and right
            // minus the height of the current bar.
            int minMaxHeight = Math.min(lmax[i], rmax[i]);
            res += minMaxHeight - arr[i];
        }
        
        return res;
    }
}
