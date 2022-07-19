public class Solution {
    
    
    
    public int books(int[] books, int k) {
        
            if(books.length < k){
                return -1;
            }
        
        
            int n = books.length;
            int min = 0,max = 0;
            
            for(int i = 0;i<n;i++){
                min = Math.max(min,books[i]);
                max += books[i];
            }        
            
            int low = min,high = max;
            int res = Integer.MAX_VALUE;
            while(low <= high){
                
                int mid = (low+high)/2;
                int count = 1;
                int i = 0;
                int sum = 0;
                while(i<n){
                    sum += books[i];
                    
                    if(sum > mid){
                        count++;
                        sum = books[i];
                    }
                    i++;
                }
                if(count <=k){
                    high = mid-1;
                     res = Math.min(res,mid);
                }else{
                    low = mid+1;
                }               
            }
            
        return res;
    }
}
