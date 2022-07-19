class Solution {
    
    boolean isPlaceable(int dist,int []position,int m){
        
        // placed a cow at first position
        int prev = position[0];
        
        // cow count is 1 
        int count = 1;
        
        // check from next position
        for(int i=1;i<position.length;i++){
            if(position[i] - prev >= dist){
                count++;
                prev = position[i];
            }
        }
        // if we managed to place m cows
        if(count >=m){
            return true;
        }
        return false;
        
    }
    
    
    
    public int maxDistance(int[] position, int m) {
        //sorted the array
        Arrays.sort(position);
        
        int n = position.length;
        
        // got the min value 
        int low = 1;
        
        // got the max value of search space
        int high = position[n-1] - position[0];
        
        int res = 0;
        
        while(low <= high){
            
            int mid = (low+high)/2;
            // if all the balls can be placed with the distance
            if(isPlaceable(mid,position,m)){
                res = Math.max(res,mid);
                low = mid+1;
            }else{
                // reduce the distance
                high = mid-1;
            }            
        }
        return res;
        
        
    }
}