package com.jenkins;

import org.testng.annotations.Test;

public class JenkinsProgram {
	
	@Test(priority=1)
		public void startEngine() {
			System.out.println("Engine started");
		}
	
	@Test(priority=2)
		public void putFirstGear() {
			System.out.println("Car is in first gear");
		}
	
	@Test(priority=3)
		public void putSecondGear() {
			System.out.println("Car is in second gear");
		}
	
	@Test(priority=4)
		public void putThirdGear() {
			System.out.println("Car is in third gear");
		}
	}

