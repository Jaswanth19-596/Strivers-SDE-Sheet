class Solution{
   
   
   void generateSubsets(int ind,int sum,ArrayList<Integer> arr,int n,ArrayList<Integer> res){
       
       
       if(ind == n){
           res.add(sum);
           return;
       }
       
       //pick 
       generateSubsets(ind+1,sum+arr.get(ind),arr,n,res);
       
       
       // not pick
       generateSubsets(ind+1,sum,arr,n,res);
       
   }
   
   
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        ArrayList<Integer> res = new ArrayList<>();
        
        generateSubsets(0,0,arr,n,res);
        
        return res;
    }
}