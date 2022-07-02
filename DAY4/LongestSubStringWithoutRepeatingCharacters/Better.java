class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        
        int res = 0;
        
        int l = 0,r = 0;
        
        Set<Character> set = new HashSet<>();
        
        while(r < n){
            if(set.contains(s.charAt(r))){
                // move the left pointer
                while(set.contains(s.charAt(r)) == true){
                    set.remove(s.charAt(l));
                    l++;
                    System.out.print(set);
                }
            }
            
            set.add(s.charAt(r));
            r++;
            res = Math.max(res,set.size());
        }
        return res;
    }
}