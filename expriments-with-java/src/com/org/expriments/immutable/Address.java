package com.org.expriments.immutable;

import java.util.List;

public class Address
{
	private String street;
	private String city;
	private String state;
	private List<String> hobbies;

	public Address(String street, String city, String state, List<String> hobbies)
	{
		this.street = street;
		this.city = city;
		this.state = state;
		this.hobbies = hobbies;
	}

	public String getStreet()
	{
		return street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public List<String> getHobbies()
	{
		return hobbies;
	}

	public void setHobbies(List<String> hobbies)
	{
		this.hobbies = hobbies;
	}

	@Override
	public String toString()
	{
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", hobbies=" + hobbies + "]";
	}
}
