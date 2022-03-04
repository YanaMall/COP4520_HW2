//Problem 1
import java.io.*;
import java.util.Random;

public class Minotaur
{
	public static void main(String args[])
	{
		/* 
			Each guest should eat the cupcake, leave an empty plate (Each new guest will request the cupcake)
			and exit the labyrinth. If they are picked to enter again, they should not eat the cupcake again, to keep
			a consistent count. Before the game starts, the guests should select 
			a person to keep count. They repeatedly enter the labyrinth after each guest and keeping 
			count of each time they find an empty plate (meaning the person before them has entered 
			the maze for the first time and eaten a cupcake), and ignoring when they find a cupcake
			(meaning the person before them has entered the maze before and this time has not eaten the cupcake).
			Once their count is equivalent to the number of guests, then this person will know that every guest has
			entered the maze.
		*/
		Random rand = new Random();
		int N = 50; //Total number of guests and threads(?)
		int count = 1; //Set to 1 to account for count keeper
		int[] guests = new int[50]; //array of guests
		int cupcake = 1; //1 means there is a cupcake
		for(int i : guests)
		{
			guests[i] = 0;
		}
		while (count < N)
		{
			int guest = rand.nextInt(49)+1; //Randomize which guest is picked
			if(guests[guest] == 0) //This guest is new
			{
				if(cupcake == 1)
				{
					cupcake = 0;
					count++;
					System.out.println("%d number of guests have been in." + count);
					//A cupcake was there when they entered and eat it, set cupcake to 0 and increase count
				}
			}
			else if(guests[guest] == 1 && cupcake == 0)
			{
				//The guest has entered before, if there isnt a cupcake,
				//they will request it
				cupcake = 1;
			}
		}
	}
}