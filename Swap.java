public class Swap {

    public static void swap(int x, int y)
    {
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.print(x+" "+y);
    }
    public static void main(String args[])
    {
        int x = 100;
        int y = 10;
        swap(x,y);
    }
   
}
