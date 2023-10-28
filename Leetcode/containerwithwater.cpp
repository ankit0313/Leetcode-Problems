/*   https://leetcode.com/problems/container-with-most-water/

*/
class Solution {
public:
    int maxArea(vector<int>& height) {
        int i =0;
        int j = height.size()-1;
        int maxArea = 0;
        int len,breadth,area;
        while(i<j){
            breadth = j-i;
            len = min(height[i],height[j]);
            area = len*breadth;
           maxArea = max(maxArea,area);
        
        if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
};