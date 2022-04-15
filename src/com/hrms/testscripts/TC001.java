package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.General;

public class TC001 {
	// public static void main(String args[]) {
	@Test
	public void tc001() {
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplicaation();
		obj.login();
		obj.logout();
		obj.closeApplicaation();
	}

}
