package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Carloan {
	
	
	
	@Test
	public void carloanlogin() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Rushi\\eclipse-workspace\\TestNG Tutorial\\src\\test\\datadriven.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		System.out.println("car loan login");
	}
	
	@Test
	public void carloanlogout() {
		System.out.println("car loan logout");
	}
	
	
	@Test
	public void carloanform() {
		System.out.println("car loan form");
		
	}
	
	public void clearCookies() {
		System.out.println("delete cookies");
	}
	
	
	public void openBrowser() {
		System.out.println("open broswer");
	}
	

	public void closeBrowser() {
		System.out.println("close broswer");
	}
	

	public void closeBrowsernew() {
		System.out.println("close broswer");
	}
	
	public void closeBrowsernew123() {
		System.out.println("close broswer");
	}
	
	
	@DataProvider
	public Object[][] getData() {
		//1 set combination username , password
		//2
		//3
		
		Object [][] data = new Object [3][2];
		
		data[0][0] = "firstsetUsername";
		data [0][1]= "firstsetpassword";
		
		data[1][0] = "SecondsetUsername";
		data [1][1]= "Secondsetpassword";
		
		data[2][0] = "thirdsetUsername";
		data [2][1]= "thirdsetpassword";
		
		return data;
	}

}
