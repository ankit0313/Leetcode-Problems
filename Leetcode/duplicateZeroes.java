

class Solution {
    public void duplicateZeros(int[] arr) {
	    // Iterate through the original array
        for(int i=0;i<arr.length;i++){  
		// Check if the current element is 0
            if(arr[i] == 0){
		       // If it's a zero, we need to duplicate it
            // Start from the end of the array and shift elements to the right
                for(int j=arr.length-1;j>=i+1;j--)    
                {                    
                    arr[j] = arr[j-1];            
                }
		// Move the loop index by one to skip the next element,
            // as we have already duplicated a zero
                i=i+1;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
