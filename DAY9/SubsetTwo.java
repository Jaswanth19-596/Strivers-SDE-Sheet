class Solution {
    
    void generateSubsets(int ind,int arr[],ArrayList<Integer> ds,List<List<Integer>> res){
        
        if(ind == arr.length){
            res.add(new ArrayList<>(ds));
            return ;
        }
        for(int i = ind;i<arr.length;i++){
            if(i == ind || arr[i] != arr[i-1]){
                ds.add(arr[i]);
                res.add(new ArrayList<>(ds));
                generateSubsets(i+1,arr,ds,res);
                ds.remove(Integer.valueOf(arr[i]));
            }
        }
    }
    
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int n = nums.length;
        Arrays.sort(nums);
        generateSubsets(0,nums,new ArrayList<Integer>(),list);
        return list;
    }
}