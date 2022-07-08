class Solution {
    
    
    public List<List<Integer>> threeSum(int[] arr) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        Arrays.sort(arr);
        
        int n = arr.length;
        
        for(int i = 0;i<n;i++){
            
            if(i == 0 || ((i>0) && arr[i] != arr[i-1])){
                int low = i+1,high = n-1;
                int rem = 0 - arr[i];
                
                while(low < high){
                    
                    if(arr[low] + arr[high] == rem){
                        ArrayList<Integer> res = new ArrayList<>();
                        Collections.addAll(res,arr[i],arr[low],arr[high]);
                        
                        list.add(res);
                        while(low < high && arr[low] == arr[low+1]) low++;
                        while(high > low && arr[high] == arr[high-1])   high--;
                        
                        low++; high--;
                    }     
                    else if(arr[low] + arr[high] < rem) low++;
                    else   high--;
                }                
            }            
        }
        return list;
        
    }
}