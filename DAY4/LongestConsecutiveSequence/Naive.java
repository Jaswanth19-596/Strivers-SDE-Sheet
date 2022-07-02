// Naive Approach 
// Sort the array and increase the count
// if the elements are equal ignore the elements

class Solution {

    public int longestConsecutive(int[] arr) {
	
	// if the array is empty        
        if(arr == null || arr.length == 0){
            return 0;
        }
        
	// Sort the array
        Arrays.sort(arr);
        
        int res = 1;
        
        int count = 1;
        
	
        for(int i = 1;i<arr.length;i++){
	    // if the elements are equal then ignore 
            if(arr[i] - arr[i-1] == 0) continue;
            
	    // if the difference is 1 then increase the count
            if(arr[i] - arr[i-1] == 1){
                count++;
                res = Math.max(count,res);
            }else{
		// if diff is not 1 . again start count from 1
                count = 1;
            }
        }
        return res;
    }
}
