package com.main;

public class AccessModifier1 {

	private int id = 1;
	
	public void print1()
	{
		
		System.out.println("This is from Public class");
	}
	
	protected void print2()
	{
	    
		System.out.println("This is from Protected class");
	}
	
	void print3()
	{
		System.out.println("This is from Default class");
	}
	
	private void print4()
	{
		
		System.out.println("This is from Private class");
	}
	
	public static void main(String[] args)
	{
		AccessModifier1 am = new AccessModifier1();
		/* public, protected, default and private methods are accessible
		 * within the class.
		 */
		
		// am.id; (Private variable is only accessible from same class)
		am.print1();
		am.print3();
		am.print2();
		am.print4();
	}
}
