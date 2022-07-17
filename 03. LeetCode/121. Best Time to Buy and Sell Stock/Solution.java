import java.util.*;

class Solution {
    
    public int maxProfit(int[] prices) {
        int answer = 0;
        int buy = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else{                
                answer = Math.max(answer, prices[i] - buy);
            }            
        }
        return answer;
    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println( solution.maxProfit(prices) );
		
		int[] prices2 = { 7, 6, 4, 3, 1 };
		System.out.println( solution.maxProfit(prices2) );
	}
}