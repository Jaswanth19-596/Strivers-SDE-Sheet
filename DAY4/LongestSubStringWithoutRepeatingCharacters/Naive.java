public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        
        int res = 0;
        
        for(int i = 0;i<n;i++){
            
            Set<Character> set = new HashSet<>();
            
            for(int j = i;j<n;j++){
                if(set.contains(s.charAt(j))){
                    break;
                }else{
                    set.add(s.charAt(j));
                    res = Math.max(res,set.size());
                }
            }
        }
        // res = Math.max(res,set.size())
        
        return res;
        
    }