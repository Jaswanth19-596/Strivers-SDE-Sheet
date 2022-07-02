// Using HashSet

class Solution {
    public int longestConsecutive(int[] arr) {
        
        if(arr == null || arr.length == 0)  return 0;
        
        Set<Integer> set = new HashSet<Integer>();
        
        int longestSeq = 0;
        
        for(int ele : arr)  set.add(ele);
        
        for(int ele : arr){
         
            if(!set.contains(ele-1)){
                
                int currentStreak = 0;
                
                while(set.contains(ele)){
                    count++;
                    ele++;
                }
                
                longestSeq = Math.max(count,longestSeq);
            }
        }
        return longestSeq;
        
    }
}