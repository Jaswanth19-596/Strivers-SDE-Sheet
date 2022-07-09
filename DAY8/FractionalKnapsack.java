/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    
    class ItemComparator implements Comparator<Item>{
        public int compare(Item a,Item b){
            double res1 = (double)a.value / (double)a.weight;
            double res2 = (double)b.value / (double)b.weight;
            
            if(res1 < res2){
                return 1;
            }
            else if(res2 < res1){
                return -1;
            }
            else return 0;
            
        }
    }
    
    
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr,new ItemComparator());
     
        // for(int i = 0;i<n;i++){
        //     System.out.println(arr[i].value + " "+arr[i].weight);
        // }
        
        
        double profit = 0;
        
        int i = 0;
        for(i = 0;i< n;i++){
            if(arr[i].weight <=W){
                W -= arr[i].weight;
                profit += arr[i].value;
            }else{
                profit = profit + ((double)arr[i].value/(double)arr[i].weight) *(double)W;
                break;
            }
        }
        
        return profit;
    }
}