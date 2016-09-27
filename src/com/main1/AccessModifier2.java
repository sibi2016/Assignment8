package com.main1;
import com.main.*;

public class AccessModifier2 {

	public static void main(String[] args) {
		
		AccessModifier1 am1 = new AccessModifier1();
		// Only Public method is accessible outside the package without subclass.
		am1.print1();

	}
}
