package com.main;

public class AccessModifier3 {
	
	public static void main(String[] args){
	AccessModifier1 am = new AccessModifier1();
	/* Private method print4() is not accessible from another class
	 * in the same package.
	 */
    am.print1();
    am.print2();
    am.print3();
	}
}
