package com.Project_TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult ;

public class Retry implements IRetryAnalyzer{
				
					int Count = 1;
					int Max = 2;
				@Override
				public boolean retry(ITestResult result) {
					if (Count>Max)	{
						return true;
					}else {
						return false;
					}
				
				
//					return false;
				}
}
