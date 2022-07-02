// update the left pointer by storing the indexes in the hashmap

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        
        int res = 0;
        
        int l = 0,r = 0;
        
        Map<Character,Integer> map = new HashMap<>();
        
        while(r < n){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(map.get(s.charAt(r))+1,l);
            }
            map.put(s.charAt(r),r);
            res = Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}