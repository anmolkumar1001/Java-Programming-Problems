import java.util.Scanner;

public class HackerRank10 {

    public static String getSmallestAndLargest(String s, int k) {
        String st=s.substring(0,k); 
        String smallest = st;
        String largest = st;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=1;i<=s.length()-k;i++)
        {
            st=s.substring(i,i+k);
            if(st.compareTo(smallest)<0)
            {
                smallest=st;
            }
            if(st.compareTo(largest)>0)
            {
                largest=st;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}