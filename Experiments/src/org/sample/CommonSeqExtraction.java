package org.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonSeqExtraction
{
	public static void main(String[] args)
	{
		String[] s1 = {"flower", "flow", "flowership"};

		List<String> stringList = Arrays.asList(s1);
		Collections.sort(stringList);

		String commonSeq = "";

		for(int i = 0; i < stringList.get(0).length(); i++)
		{
			/*boolean mismatch = false;
			
			for(int j = 1; j < stringList.size(); j++)
			{
				if(stringList.get(j).charAt(i) != stringList.get(0).charAt(i))
				{
					mismatch = true;
					break;
				}
			}
			if(mismatch)
			{
				break;
			}
			else
			{
				commonSeq += stringList.get(0).charAt(i);
			}*/

			if(stringList.get(0).charAt(i) != stringList.get(stringList.size() - 1).charAt(i))
			{
				break;
			}
			commonSeq += stringList.get(0).charAt(i);
		}

		System.out.println(commonSeq);
	}
}
