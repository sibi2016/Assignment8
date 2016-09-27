package com.main;

public final class ImmutableClass {
	
	private final String name;
	
	private final Integer id ;
	
	private ImmutableClass(String str,Integer i)
	{
		this.name = str;
		this.id = i;
	}
	public String getName()
	{
		return name;
	}
	public Integer getId()
	{
		return id;
	}
	
	public static void main(String[] args){
		
		ImmutableClass im = new ImmutableClass("Roy",12);
		System.out.println("Name is :" + im.getName());
		System.out.print("ID is :" + im.getId());
		
	}
}
