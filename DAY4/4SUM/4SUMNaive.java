class Solution {
      
    
    int binarySearch(int arr[],int low,int high,long key){
        while(low <= high){
            int mid = (low+high)/2;
            
            if((long)arr[mid] == key){
                return mid;
            }
            else if((long)arr[mid] < key){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
    
    
    public List<List<Integer>> fourSum(int[] arr, int target) {
        
        Arrays.sort(arr);
        
       Set<List<Integer>> set = new HashSet<List<Integer>>();
        
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    long sum = (long)arr[i] + (long)arr[j] + (long)arr[k];
                    long rem = (long)target - (long)sum;
                    int index = 0;
                    index = binarySearch(arr,k+1,n-1,rem);
                    if(index != -1){
                        ArrayList<Integer> list = new ArrayList<>();
                        Collections.addAll(list,arr[i],arr[j],arr[k],arr[index]);
                        set.add(list);
                    }
                }
            }
        }
     
        System.out.print(set);
        
        List<List<Integer>> res = new ArrayList<>();
        // List<List<Integer>> permu = new ArrayList<>();
        
        for(List<Integer> list: set){
            res.add(list);
        }
        return res;
    }
}