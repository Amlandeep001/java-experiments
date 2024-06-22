package com.org.preparation;

import java.util.Arrays;

public class RemoveElementFromArray
{
	public static void main(String[] args)
	{
		int[] array = {1, 2, 3, 4, 5};
		int element = 3;

		int[] newArray = remove(array, element);
		System.out.println(Arrays.toString(newArray));
	}

	private static int[] remove(int[] array, int element)
	{
		/*int[] newArray = new int[array.length - 1];
		int index = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] != element)
			{
				newArray[index] = array[i];
				index++;
			}
		}
		
		return newArray;*/

		return Arrays.stream(array).filter(e -> e != element).toArray();
	}

}
