import java.util.Scanner;
class SwapNum {  //Define a class Question with two elements e1 and e2.
  Scanner sc = new Scanner(System.in);
int e1 = sc.nextInt();  //Read e1
int e2 = sc.nextInt();  //Read e2
}
public class SwapNum1 {

// Define static method swap()to swap the values of e1 and e2 of class Question.
static void swap(SwapNum obj)
{
  int temp;
  temp = obj.e1;
  obj.e1 = obj.e2;
  obj.e2 = temp;
}

public static void main(String[] args) {
    //Create an object of class Question
        SwapNum t = new SwapNum();
      //Call the method swap()
    swap(t);
    
    System.out.println(t.e1+" "+t.e2);    
      }
}
    