class Solution {
    
    int skipDuplicates(int []arr,int i){
        int k = i+1;
        
        while(k<arr.length){
            if(arr[k] == arr[k-1])  k++;
            else break;
        }
        return k;
    }
    
    int skipDuplicatesReverse(int []arr,int i){
        int k = i-1;
        while(k>=0){
            if(arr[k] == arr[k+1])  k--;
            else break;
        }
        return k;
    }
    
    
    
    
    public List<List<Integer>> fourSum(int[] arr, int target) {
        
        Arrays.sort(arr);
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        int n = arr.length;
        int i = 0;
        
        while(i<n){
            int j = i+1;
            while(j<n){
                int low = j+1;
                int high = n - 1;
                long rem = (long)target - (long)arr[i] - (long)arr[j];
                while(low < high){
                    if((long)arr[low]+(long)arr[high] == rem){
                        ArrayList<Integer> list = new ArrayList<>();
                        Collections.addAll(list,arr[i],arr[j],arr[low],arr[high]);
                        res.add(list);
                        low = skipDuplicates(arr,low);
                        high = skipDuplicatesReverse(arr,high);
                    }
                    else if((long)arr[low]+(long)arr[high] < rem){
                        low = skipDuplicates(arr,low);
                    }
                    else{
                        high = skipDuplicatesReverse(arr,high);
 
                    }
                }
                
                j = skipDuplicates(arr,j);
            }
            i = skipDuplicates(arr,i);
        }
        
        return res;
    }
}