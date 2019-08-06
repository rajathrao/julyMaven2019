package com.flexon.MavenTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example1 {
	
	
	/* we created maven project--- manage dependencies and it is a build tool . 
	 * Maven created a project strcture for us- ex package structure 
	 * we imported TESTNG dependency 
	 * TESTNG is a testing library - 
	 * a bunch of annotations and assertions 
	 */
	@BeforeTest
	public void beforeTest() { 
		System.out.println(" I am in the before test method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println(" i am in the before class emthod");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("you are in the before MEthod ");
	}
	
	@Test
	public void test1() {
		
		System.out.println("you are in test1 method");
	}
	
	@Test
	public void Test2() {
		
		System.out.println("you are in test2 method");
	}

	@Test
	public void Test3() {
		
		System.out.println("you are in test3 method");
	}
	
	
	@AfterTest
	public void afterTest() { 
		System.out.println(" I am in the after test method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println(" i am in the after class emthod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("you are in the after MEthod ");
	}
}
