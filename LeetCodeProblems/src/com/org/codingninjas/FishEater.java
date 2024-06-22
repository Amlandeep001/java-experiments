package com.org.codingninjas;

//https://www.codingninjas.com/studio/problems/fish-eater_1089581
public class FishEater
{
	public static int fishEater(int[] fishes)
	{
		// Write your code here.
		int c = 1;

		int max = fishes[0];

		for(int i = 1; i < fishes.length; i++)
		{
			if(fishes[i] >= max)
			{
				c++;
				max = fishes[i];
			}
		}

		return c;
	}

	public static void main(String[] args)
	{
		int[] fishes = {4, 2, 3, 1, 5};
		System.out.println(FishEater.fishEater(fishes));
	}
}
