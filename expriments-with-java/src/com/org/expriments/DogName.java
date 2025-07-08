package com.org.expriments;

public class DogName implements Cloneable
{
	private final String dname;

	public DogName(String dname)
	{
		this.dname = dname;
	}

	public String getName()
	{
		return dname;
	}

	// Overriding clone() method of Object class
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static void main(String[] args)
	{
		DogName obj1 = new DogName("Tommy");
		try
		{
			DogName obj2 = (DogName) obj1.clone();
			System.out.println(obj2.getName());
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}