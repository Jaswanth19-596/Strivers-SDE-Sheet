public class Solution
{
public static int findMinimumCoins(int amount)
    {
        int []den = new int[]{1000,500,100,50,20,10,5,2,1};
    
        int coins = 0;
        int i = 0;
        while(i<9 && amount > 0){
            if(amount >= den[i]){
                int n = amount / den[i];
                coins += n;
                amount -= (n * den[i]);
                i++;
            }
            else{
                i++;
            }
        }
        return coins;
    }
}
