class Solution {
    
    public int removeDuplicates(int[] arr) {
        
        int i = 1, ptr = 0;
        
        for(i = 1;i<arr.length;i++){
            if(arr[i] != arr[ptr]){
                ptr++;
                arr[ptr] = arr[i];
            }
        }
        
        return ptr+1;
        
    }
}