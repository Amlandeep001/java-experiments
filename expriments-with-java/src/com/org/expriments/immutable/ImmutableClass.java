package com.org.expriments.immutable;

import java.util.Date;

public final class ImmutableClass
{
	private final int id;

	private final String name;

	private final Date dob;

	public ImmutableClass(int id, String name, Date dob)
	{
		this.id = id;
		this.name = name;
		this.dob = new Date(dob.getYear(), dob.getMonth(), dob.getDay());
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public Date getDob()
	{
		return new Date(dob.getYear(), dob.getMonth(), dob.getDay());
	}

}
