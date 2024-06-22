package org.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample
{

	public static void main(String... a)
	{
		List<User> userList = new ArrayList<>();
		userList.add(new User(1111, Arrays.asList("9874345678", "9873345678", "9871345678")));
		userList.add(new User(2222, Arrays.asList("9873234578", "9871234078", "9874303478")));
		userList.add(new User(3333, Arrays.asList("9871237678", "9876789578", "9874908578")));

		List<String> xmobileList = userList.stream()
				// .map(user -> user.getMobileNos())
				// .flatMap(list ->list.stream())
				// .flatMap(Collection::stream)
				.flatMap(user -> user.getMobileNos().stream())
				.filter(mobileNo -> mobileNo.startsWith("9874"))
				.collect(Collectors.toList());

		List<String> ymobileList = new ArrayList<>();

		userList.stream()
				.filter(user ->
				{
					user.getMobileNos().forEach(m ->
					{
						if(m.startsWith("9874"))
						{
							ymobileList.add(m);
						}
					});
					return true;
				}).collect(Collectors.toList());

		System.out.println(xmobileList);
		System.out.println(ymobileList);
	}
}

class User
{
	int id;
	List<String> mobileNos;

	public User(int id, List<String> mobileNos)
	{
		this.id = id;
		this.mobileNos = mobileNos;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public List<String> getMobileNos()
	{
		return mobileNos;
	}

	public void setMobileNos(List<String> mobileNos)
	{
		this.mobileNos = mobileNos;
	}

	@Override
	public String toString()
	{
		return "User [id=" + id + ", mobileNos=" + mobileNos + "]";
	}
}
