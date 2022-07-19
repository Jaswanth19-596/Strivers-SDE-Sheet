class Solution {
    
    int searchRotated(int arr[],int key){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        
        while(low <= high){
            int mid = (low+high)/2;
            
            if(arr[mid] == key) return mid;
            
            // check if left array is sorted or not
            if(arr[low] <= arr[mid]){
                if(arr[low]<=key && key<arr[mid]){
                    high = mid-1;
                }else{
                    low = mid + 1;
                }                
            }
            // right array is sorted
            else{
                if(arr[mid+1]<=key && key<=arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid -1;
                }
            }
            
            
            
        }
        return -1;
    }
    
    
    public int search(int[] nums, int target) {
        return searchRotated(nums,target);    
    }
}