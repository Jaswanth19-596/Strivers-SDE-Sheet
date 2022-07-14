class Solution {
    boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!= s.charAt(j))   return false;
            i++;
            j--;
        }
        return true;
    }
    
    void findPalindromes(int ind,String s,List<String> list, List<List<String>> res){
        
        if(ind == s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = ind;i<s.length();i++){
            if(isPalindrome(s,ind,i)){
                list.add(s.substring(ind,i+1));
                findPalindromes(i+1,s,list,res);
                list.remove(list.size()-1);
            }
        }
        
    }
    
    
    public List<List<String>> partition(String s) {
        
        List<List<String>> res = new ArrayList<List<String>>();
        findPalindromes(0,s,new ArrayList<String>(),res);    
        
        return res;
    }
}