//Problem 2
import java.io.*;
import java.util.Random;

public class GlassVase
{
	/*
		This is an implementation of option 3. The bulk of the code is based on logic work
		from problem one. It involves keeping tracking of which guests have already visited
		the room, since guests are allowed to queue multiple times.
	*/
	public static void main(String args[])
	{
		Random rand = new Random();
		int N = 50; //Total number of guests and threads(?)
		int count = 0;
		int[] guests = new int[50]; //array of guests
		for(int i : guests)
		{
			guests[i] = 0;
		}
		while (count < N)
		{
			int guest = rand.nextInt(49)+1; //Randomize which guest is picked
			if(guests[guest] == 0) //This guest is new
			{
				guests[guest] = 1; //Signals that this guest has visited the room
				count++; //Each guest gets added to the count
				System.out.println(count + " guest(s) have visited the room.");
			}
			else
			{
				System.out.println("This guest has already visited the room.");
			}
		}
	}
}