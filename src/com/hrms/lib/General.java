package com.hrms.lib;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utility.Log;

public class General extends Global {

	public void openApplicaation() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\91984\\OneDrive\\Desktop\\pd\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		System.out.println("Application Opened");
		Log.info("Entered Application");
	}

	public void login() {
		driver.findElement(By.name(txt_logname)).sendKeys(un);;
		driver.findElement(By.name(txt_password)).sendKeys(pw);;
		driver.findElement(By.name(btn_login)).click();;
		System.out.println("login complete");
		Log.info("Log in");
	}

	public void logout() {
		driver.findElement(By.linkText(link_logout));
		Log.info("Log out");
	}

	public void enterFrame() {
		driver.switchTo().frame(frm_frame);
		Log.info("Entered Frame");
	}

	public void exitFrame() {
		driver.switchTo().defaultContent();
		Log.info("exit Frame");
	}

	public void addEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_FN)).sendKeys(fn);
		driver.findElement(By.name(txt_LN)).sendKeys(ln);
		driver.findElement(By.id(btn_save)).click();
		Log.info("Added Emp");
	}

	public void closeApplicaation() {
		driver.quit();
	}

}
