import java.util.HashMap;

class Solution {
    public int RomanToInteger(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int res=0;
        int val,prevVal;
        
        for(int i=0;i<str.length();i++)
        {
            val = map.get(str.charAt(i));
            
            if(i+1<str.length())
            {
                prevVal=map.get(str.charAt(i+1));
                
                if(val>=prevVal)
                {
                    res=res+val; 
                }
                else
                {
                    res=res+prevVal-val;
                    i++;
                }
            }
            else
            {
                res=res+val; 
            }  
        }
        return res;
    }
   
   
}