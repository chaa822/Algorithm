/**
 * @param {string} s
 * @return {number}
 */
 var romanToInt = function(s) {
    var roman = {
        'I' : 1,
        'V' : 5,
        'X' : 10,
        'L' : 50,
        'C' : 100,
        'D' : 500,
        'M' : 1000
    };
    
    var answer = roman[s[s.length-1]];
    for(var i = s.length - 2; i >= 0; i--){
        var a = roman[s[i]];
        var b = roman[s[i+1]];
        
        if(a >= b)
            answer += a;
        else
            answer -= a;
    }
    
    return answer;
};