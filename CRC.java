import java.util.Scanner;
import java.io.*;
public class CRC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] message;
		int [] gen;
		int [] app_message;
		int [] rem;
		int [] trans_message;
		int message_bits,gen_bits,total_bits;
		
		System.out.println("Enter the number of bits in msg: ");
		message_bits = sc.nextInt();
		
		message = new int[message_bits];
		System.out.println("Enter message bits: ");
		for(int i=0;i<message_bits;i++)
		{
			message[i] = sc.nextInt();
		}
		
		System.out.println("Enter no of bits in gen: ");
		gen_bits = sc.nextInt();
		gen = new int[gen_bits];
		System.out.println("Enter gen bits: ");
		for(int i=0;i<gen_bits;i++)
		{
			gen[i] = sc.nextInt();
		}
		total_bits = message_bits + gen_bits - 1;
		app_message = new int[total_bits];
		rem = new int [total_bits];
		trans_message = new int[total_bits];
		
		for(int i=0;i<message.length;i++)
		{
			app_message[i] = message[i];
		}
		System.out.println("Message bits are: ");
		for(int i=0;i<message_bits;i++)
		{
			System.out.print(message[i]);
		}
		System.out.println("Gen bits are: ");
		for(int i=0;i<gen_bits;i++)
		{
			System.out.print(gen[i]);
		}
		System.out.println("Appened message are: ");
		for(int i=0;i<app_message.length;i++)
		{
			System.out.print(app_message[i]);
		}
		
		for(int j=0;j<app_message.length;j++)
		{
			rem[j] = app_message[j];
		}
		
		rem = computeCRC(app_message,gen,rem);
		for(int i=0;i<app_message.length;i++)
		{
			trans_message[i] = (app_message[i]^rem[i]);
		}
		System.out.println("Transmitted message from the transmitter is: ");
		for(int i=0;i<trans_message.length;i++)
		{
			System.out.print(trans_message[i]);
		}
		
		System.out.println("Enter received message of " + total_bits + " bits at receiver end: ");
		for(int i=0;i<trans_message.length;i++)
		{
			trans_message[i] = sc.nextInt();
		}
		System.out.println("Received message is: ");
		for(int i=0;i<trans_message.length;i++)
		{
			System.out.print(trans_message[i]);
		}
		for(int j=0;j<trans_message.length;j++)
		{
			rem[j] = trans_message[j];
		}
		rem = computeCRC(trans_message,gen,rem);
		for(int i=0;i<rem.length;i++)
		{
			if(rem[i] != 0)
			{
				System.out.println("There is error in the received me:");
				break;
			}
			if(i == rem.length - 1)
			{
				System.out.println("There is no error in received mess:");
			}
		}

	}
	static int[] computeCRC(int app_message[], int gen[], int rem[])
	{
		int current = 0;
		while(true)
		{
			for(int i=0;i<gen.length;i++)
			{
				rem[current+i] = (rem[current+i]^gen[i]);
			}
			while(rem[current] == 0 && current != rem.length - 1)
			{
				current++;
			}
			if((rem.length - current) < gen.length)
			{
				break;
			}
		}
		return rem;
	}

}
