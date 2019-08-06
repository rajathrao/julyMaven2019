package com.flexon.MavenTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	/*Assertions are used to perform validations for ur test cases and output testcase pass or fail
	 * read data from a data source @DataProvider 
	 * TestNG.XML -- configure groups , disable some test cases and enable 
	 */
	
	@Test(priority =2)
	public void test1() {
		Assert.assertTrue(true);
	}
	
	@Test(priority =1)
	public void test2() {
		Assert.assertTrue(true, "not matching hte expected condition");
	}
	
	@Test(priority =3)
	public void test3() {
		Assert.assertEquals("Flexon","Flexon");
	}

}
