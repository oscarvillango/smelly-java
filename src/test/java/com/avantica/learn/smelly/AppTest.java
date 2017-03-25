package com.avantica.learn.smelly;

import org.junit.Test;

public class AppTest {
	
	@Test
	public void verifyMainMethod(){
		try {
			App.main(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
