
var maxProfit = function(prices) {
    let buy = 10000;
    let answer = 0;
    
    for(let i = 0; i < prices.length; i++){
        if(prices[i] < buy){
            buy = prices[i];
        }else{
            answer = Math.max(answer, prices[i] - buy);
        }
    }
    return answer;
};

console.log( maxProfit([7, 1, 5, 3, 6, 4]) );
console.log( maxProfit([7, 6, 4, 3, 1]) );