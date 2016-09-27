package com.main;

public class Assignment8d {
	
		
	static
	{
		System.out.println("This is from first static block");
	}
	
	public Assignment8d ()
	{
		System.out.println("This is from constructor");
	}
	
	public static void mehtod()
	{
		System.out.println("This is from static method");
	}
	
	static
	{
		System.out.println("This is from second static block");
	}
	
	public static void main(String[] args)
	{
		Assignment8d a = new Assignment8d();
		a.mehtod();
	}
	
	
}
