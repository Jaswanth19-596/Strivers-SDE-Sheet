class Solution {
  public int trap(int[] arr) {
        
        int n = arr.length;
        
        int res = 0,leftMax = 0,rightMax = 0;
        
        int low = 0,high = n - 1;
      
        while(low <= high){
            
            // making sure that there is a larget building on right side
            if(arr[low] <= arr[high]){
                
                if(leftMax > arr[low]){
                    res += leftMax - arr[low];
                }else{
                    leftMax = arr[low];
                }
                low++;                
            }
            else{
                if(rightMax > arr[high]){
                    res += rightMax - arr[high];
                }
                else{
                    rightMax = arr[high];
                }
                high--;
            }
        }
      return res;
      
      
    }
}