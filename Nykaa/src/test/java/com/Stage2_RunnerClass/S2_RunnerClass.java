package com.Stage2_RunnerClass;

import com.Stage1_BaseClass.S1_BaseClass;
import com.Stage2_BaseClass.Login_01Implements;

public class S2_RunnerClass extends S1_BaseClass {
	
						public static void main(String[] args) throws InterruptedException {
								S2_RunnerClass S2 = new S2_RunnerClass();
								S2.getDriver("chrome");
								S2.getUrl("https://www.nykaa.com/");
								System.out.println("Browser Launched");
								
								Login_01Implements pom = new Login_01Implements();
							
								S2.Click(pom.getSignIn_btn());
								
								S2.Click(pom.getSignMobile_btn());
								
								S2.Wait_ImplicitWait();
								
								S2.Click(pom.getMbInputBox());
								
								S2.sendKeys(pom.getMbInputBox(), "8903702230");
								
								S2.Click(pom.getProceedBtn());
								
								S2.Click(pom.getOtpField());
								
								Thread.sleep(20000);
								
								S2.Click(pom.getVerifyBtn());
								
								S2.Quit();
}
}
