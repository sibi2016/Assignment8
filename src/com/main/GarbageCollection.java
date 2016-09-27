package com.main;

public class GarbageCollection {
	
	/* finalize() method is invoked each time before the object is 
	* garbage collected.
	* */
	public void finalize()
	{
		System.out.println("Object is garbage collected");
	}
	
	public static void main(String[] args){
		
		// Creating unreferenced objects by nulling the reference.
		GarbageCollection GC1 = new GarbageCollection();
		GarbageCollection GC2 = new GarbageCollection();
		GC1 = null;
		GC2 = null;
		
		// Invoking the garbage collector
		System.gc();
	}

}
