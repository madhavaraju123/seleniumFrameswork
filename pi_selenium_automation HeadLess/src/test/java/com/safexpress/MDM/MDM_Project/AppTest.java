package com.safexpress.MDM.MDM_Project;

import java.util.Random;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static void main(String[] str) {
		int nk;
		Random rn = new Random();
		nk = rn.nextInt();
		String s = Integer.toString(nk);
		s.substring(0, 3);
	}
}
