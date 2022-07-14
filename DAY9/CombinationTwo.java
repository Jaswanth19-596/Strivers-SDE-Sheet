class Solution {
    
    
    void findSubsets(int ind,int sum,int arr[],ArrayList<Integer> ds,List<List<Integer>> res){
        
        if(sum < 0) return;
        
        if(sum == 0){
            res.add(new ArrayList<Integer>(ds));
            return;
        }
        
        if(ind == arr.length){
            if(sum == 0){
                res.add(new ArrayList<Integer>(ds));
            }
            return;
        }
        
        for(int i = ind;i < arr.length;i++){
            if(i != ind && arr[i] == arr[i-1])  continue;
            
            ds.add(arr[i]);
            findSubsets(i+1,sum - arr[i],arr,ds,res);
            ds.remove(Integer.valueOf(arr[i]));
            
        }
        
    }
    
    
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(arr);

        findSubsets(0,target,arr,new ArrayList<Integer>(),list);
        
        return list;
    }
}