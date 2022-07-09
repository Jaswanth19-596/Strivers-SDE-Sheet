class Solution
{
    
    static int findPlatform(int arr[], int dep[], int n)
    {
        
        // sort the arr and dep --> coz we're only concerned about trains arriving 
        // and leaving and there's no need to keep track which train is arriving or leaving
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int platforms = 1;
        int max = 1;
        int i = 1,j = 0;
        
        while(i < n && j < n){
            
            // when the arrival of new train is before another train
            if(arr[i] <= dep[j]){
                platforms++;
                max = Math.max(max,platforms);
                i++;
            }
            else{
            // if the departure is happening
                platforms--;
                j++;
            }
        }
        return max;
    }
    
}

