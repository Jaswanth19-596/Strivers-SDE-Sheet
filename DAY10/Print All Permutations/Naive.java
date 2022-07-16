class Solution {
    
    void generatePermutations(int []arr,boolean []visited,ArrayList<Integer> list,List<List<Integer>> res){
        
        if(list.size() == arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = 0;i<arr.length;i++){
            if(visited[i] == false){
                list.add(arr[i]);
                visited[i] = true;
                generatePermutations(arr,visited,list,res);
                list.remove(Integer.valueOf(arr[i]));
                visited[i] = false;
            }
        }
        
    }
    
    
    public List<List<Integer>> permute(int[] nums) {
        boolean visited[] = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<>();
        
        generatePermutations(nums,visited,new ArrayList<>(),res);
        
        return res;
        
    }
}