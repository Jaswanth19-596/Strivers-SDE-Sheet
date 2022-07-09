class JobComparator implements Comparator<Job>{
    public int compare(Job j1,Job j2){
        if(j1.profit <= j2.profit){
            return 1;
        }
        else{
            return -1;
        }
    }
    
}


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        JobComparator com = new JobComparator();
        Arrays.sort(arr,(a,b)->b.profit - a.profit);
    
        int maxi = 0;
        for(int i = 0;i<n;i++){
            maxi = Math.max(maxi,arr[i].deadline);
        }
        
        int profit = 0;
        int count = 0;
        
        int timeline[] = new int[maxi+1];
        Arrays.fill(timeline,-1);
        
        for(int i = 0;i<n;i++){
            
            Job j = arr[i];
            
            int end = j.deadline;
            
            while(end > 0){
                if(timeline[end] == -1){
                    profit += j.profit;
                    count++;
                    timeline[end] = arr[i].id;
                    break;
                }
                end--;
            }
            
        }
        int res[] = new int[2];
        res[0] = count;
        res[1] = profit;
        
        System.out.print(Arrays.toString(timeline));
        
        return res;
        
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/