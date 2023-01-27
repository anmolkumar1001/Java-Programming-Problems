import java.util.*;
import java.io.*;

class QSort
{
    int array[];
    int length;
    int cnt;
    int n;
    String flag;

    void process() throws IOException
    {
        System.out.println("Enter the Number of element to Sorted:(>5000):");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        flag="best";
        cnt=0;
        int[] inputArr = new int[n];
        getRandomNumbers(inputArr);

        sc.close();
        int tempArr[]=new int[n];
        for(int i=0;i<inputArr.length;i++)
           tempArr[i]=inputArr[i];
        
        //Begin to sort the randomly generated numbers for best case complexity
        sort(inputArr);
        System.out.println();
        System.out.println("The time complexity for best case is " +cnt);
        PrintWriter outB = new PrintWriter(new File("q_bestsort.txt"));
        for(int i: inputArr)
           outB.print(i + " ");
        outB.close();

        cnt=0;
        flag="worst";

        //Begin to sort the randomly generated numbers for wrost case complexity
        sort(inputArr);
        PrintWriter outW = new PrintWriter(new File("q_worstsort.txt"));
        for(int i: inputArr)
           outW.print(i + " ");
        outW.close();
        System.out.println();
        System.out.println("The time Complexity for worst case is " +cnt);
        
        cnt=0;
        flag="average";

        //Begin to sort the randomly generated numbers for average case complexity
        sort(inputArr);
        System.out.println();
        System.out.println("The time Complexity for average case is " +cnt);
        PrintWriter outA = new PrintWriter(new File("q_averagesort.txt"));
        for(int i: inputArr)
            outA.print(i + " ");
        outA.close();
    }

    void getRandomNumbers(int[] inputArr) throws IOException
    {
        Random rand = new Random();
        int number,count=0;
        PrintWriter out = new PrintWriter(new File("Qrandom.txt"));
        while(count<n)
        {
            number=rand.nextInt(n)+1;
            out.print(number + " ");
            inputArr[count]=number;
            count++;
        }
        out.close();
        System.out.println("The total numbers generated: " +count);
    }

    void sort(int[] inputArr)
    {
        this.array=inputArr;
        length=inputArr.length;
        quickSort(0,length-1,0);
    }

    void quickSort(int lowerIndex, int higherIndex, int pivot)
    {
        int left=lowerIndex;
        int right=higherIndex;

        //Calculate pivot number
        switch(flag)
        {
            case "best":
            case "average":
                        pivot=array[lowerIndex+(higherIndex-lowerIndex)/2];
                        break;
            case "worst":
                        pivot=array[lowerIndex];
                        break;
        }
        while(left<=right)
        {
            //Sort in ascending order
            while(array[left]<pivot)
            {
                left++;
                cnt++;
            }
            while(array[right]>pivot)
            {
                right--;
                cnt++;
            }
            if(left<=right)
            {
                exchangeNumbers(left,right);
                //Move index to next position on both sides
                left++;
                right--;
            }
        }
        //call quicksort() method recursively
        if(lowerIndex < right)
        {
            quickSort(lowerIndex, right, pivot);
        }
        if(left < higherIndex)
        {
            quickSort(left, higherIndex, pivot);
        }
    }
    void exchangeNumbers(int l, int r)
    {
        int temp = array[l];
        array[l]=array[r];
        array[r]=temp;
    } 
}

public class QuickSort {
    public static void main(String args[]) throws IOException
    {
        QSort qs = new QSort();
        qs.process();
    }
}
