import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        char[] arr = s.toCharArray();
        int answer = roman.get(arr[arr.length - 1]);
        
        for(int i = arr.length - 2; i >= 0; i--){
            int a = roman.get(arr[i]);
            int b = roman.get(arr[i+1]);
            
            if(a >= b)
                answer += a;
            else
                answer -= a;
        }
        
        return answer;
    }
}