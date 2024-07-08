package com.org.various.sources;

public class ReverseAlphabetsInString
{
	public static void main(String[] args)
	{
		String s = "A!@#B$C%D^T&U*VWX";

		char[] ch = s.toCharArray();
		System.out.println(ch);

		/*for(int i = 0; i < ch.length; i++)
		{
			int max = i;
			if(ch[max] > 64 && ch[max] < 92)
			// if(Character.isAlphabetic(ch[max]))
			{
				for(int j = i + 1; j < ch.length; j++)
				{
					if((ch[j] > 64 && ch[j] < 92) && ch[j] > ch[max])
					// if(Character.isAlphabetic(ch[j]) && ch[j] > ch[max])
					{
						max = j;
					}
				}
				if(max != i)
				{
					char t = ch[max];
					ch[max] = ch[i];
					ch[i] = t;
				}
			}
		}*/

		int right = ch.length - 1, left = 0;

		while (left < right)
		{
			if(!Character.isAlphabetic(ch[left]))
			{
				left++;
			}
			else if(!Character.isAlphabetic(ch[right]))
			{
				right--;
			}
			else
			{
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;

				left++;
				right--;
			}
		}

		System.out.println(ch);
	}
}
