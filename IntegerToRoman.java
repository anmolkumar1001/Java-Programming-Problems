class Main {
    public static String IntegerToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanStrings = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String ans = "";
        
        for(int i=0;i<values.length;i++)
        {
            while(num>=values[i]){
                
                num = num - values[i];
                ans = ans + romanStrings[i];
            }
        }
        return ans;
    }
    public static void main(String[] args){
      System.out.println(IntegerToRoman(58));
    }
}