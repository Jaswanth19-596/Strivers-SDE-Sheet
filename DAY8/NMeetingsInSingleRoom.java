class Pair implements Comparable<Pair>{
    int start,end;
    
    Pair(int _start,int _end){
        start = _start;
        end = _end;
    }
    
    public int compareTo(Pair newPair){
        return this.end - newPair.end;
    }
    
    public String toString(){
        return this.start + " "+this.end;
    }
    
}


class Solution 
{
    
    public static int maxMeetings(int start[], int end[], int n)
    {
        
        Pair p[] = new Pair[n];
        
        for(int i = 0;i<n;i++){
            Pair p1 = new Pair(start[i],end[i]);
            p[i] = p1;
        }
        
        // sort the meetings with respect to end time
        Arrays.sort(p);
        
        // take each meeting and check if it can be performed
        int end = 0;
        int count = 0;
        for(int i = 0;i<n;i++){
            // if the next meeting is starting after the previous meeting ended 
            // then it can be accomodated
            if(p[i].start > end){
                count++;
                // update the end time 
                end = p[i].end;
            }
        }
        
        
        return count;
        
    }
}
