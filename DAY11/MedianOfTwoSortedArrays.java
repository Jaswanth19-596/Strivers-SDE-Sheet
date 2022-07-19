class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        
        if(arr1.length > arr2.length){
            int temp[] = arr1;
            arr1 = arr2;
            arr2 = temp;
        }
        int n = arr1.length;
        int m = arr2.length;
        
        int low = 0;
        int high = n;
        
        
        while(low <= high){
            int i1 = (low+high)/2;
            int i2 = (n+m+1)/2 - i1;
            
            int r1  = i1 == n ? Integer.MAX_VALUE : arr1[i1];
            int r2 = i2 == m ? Integer.MAX_VALUE : arr2[i2];
            int l1 = i1 == 0 ? Integer.MIN_VALUE : arr1[i1 - 1];
            int l2 = i2 == 0 ? Integer.MIN_VALUE : arr2[i2 - 1];
            
            // System.out.println(r1+" "+r2+" "+l1+" "+l2);
            if(l1 <= r2 && l2 <= r1){
                if((n+m)%2 == 0){
                    int max1 = Math.max(l1,l2);
                    int min1 = Math.min(r1,r2);
                    
                    return ((double)max1 + (double)min1)/ 2.0;
                }
                else{
                    return (double)Math.max(l1,l2);
                }
            }
            else if(l1 > r2){
                high = i1 -1;
            }
            else{
                low = i1 + 1;
            }
            
        }
        return 0;
        
        
    }
}