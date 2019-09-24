package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Homeloan {


	@Test(groups= {"login"})
	public void homeloanlogin() {
		System.out.println("home loan login");
	}
	
	@Test
	public void homeloanlogout() {
		System.out.println("home loan logout");
	}
	
	@Test(groups= {"smoke"})
	public void homeloanform() {
		System.out.println("home loan form");
		Assert.assertTrue(false);
	}
}
