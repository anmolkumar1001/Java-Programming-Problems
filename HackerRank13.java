import java.util.*;

public class HackerRank13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();
        String token[]=s.split("[^a-zA-Z]+");
        if(s.length()==0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(token.length);
        }
        for(String word:token)
           System.out.println(word);

        scan.close();
    }
}

