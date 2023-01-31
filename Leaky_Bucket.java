import java.util.Scanner;
public class Leaky_Bucket {
	int q[],r=0,f=0, size;
	void insert(int n)
	{
		Scanner sc = new Scanner(System.in);
		q = new int[10];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter " + i + " Element");
			int ele = sc.nextInt();
			
			if(r+1 > 10)
			{
				System.out.println("Queue full\nLost Packet: " +ele);
				break;
			}
			else
			{
				r++;
				q[i] = ele;
			}
		}
	}
	
	void delete()
	{
		Scanner sc = new Scanner(System.in);
		Thread t = new Thread();
		
		if(r == 0)
		{
			System.out.println("Queue empty");
		}
		else
		{
			for(int i=f;i<r;i++)
			{
				try
				{
					t.sleep(1000);
				}
				catch(Exception ex) { }
				System.out.println("Leacked Packet: " + q[i]);
				f++;
			}
		}
		System.out.println();
	}
	
}

class Leaky extends Thread
{
	public static void main(String[] args) {
		Leaky_Bucket q = new Leaky_Bucket();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the packet to be sent: ");
		int size = sc.nextInt();
		q.insert(size);
		q.delete();
	}
}

