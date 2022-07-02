class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int longestSeq = 0;
        
        int sum = 0;
        
        for(int i = 0;i<n;i++){
            
            sum += arr[i];
            
            if(map.containsKey(sum)){
                
                if(sum == 0){
                    longestSeq = i+1;
                }else{
                    longestSeq = Math.max(longestSeq, i - map.get(sum));
                }
                
            }else{
                map.put(sum,i);
            }
        }
        return longestSeq;
    }
}