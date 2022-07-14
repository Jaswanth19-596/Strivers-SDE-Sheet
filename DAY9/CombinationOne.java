class Solution {
    
    void findSubsets(int ind,int arr[],int sum,ArrayList<Integer> ds,List<List<Integer>> list){
        
        if(ind == arr.length){
            if(sum == 0){
                list.add(new ArrayList<>(ds));
            }
            return;
        }
        if(sum == 0){
            list.add(new ArrayList<>(ds));
            return;
        }
        
        // pick
       if(arr[ind] <= sum){
            ds.add(arr[ind]);
            findSubsets(ind,arr,sum - arr[ind],ds,list);
            ds.remove(Integer.valueOf(arr[ind]));
       }
       // don't pick        
       findSubsets(ind+1,arr,sum,ds,list);
    }
    
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        findSubsets(0,arr,target,new ArrayList<>(),list);
        return list;
        
    }
}