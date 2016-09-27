package com.main;

public class recursivePrint {
	
	public static void recursive(int n)
	{
		if (n<=10)
		{
			System.out.println(n);
			recursive(n+1);
		}
	}
	
	public static void main(String[] args)
	{
		recursivePrint.recursive(1);
	}

}
