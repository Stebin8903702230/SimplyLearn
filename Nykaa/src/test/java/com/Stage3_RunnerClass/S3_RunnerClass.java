package com.Stage3_RunnerClass;

import com.Stage1_BaseClass.S1_BaseClass;

public class S3_RunnerClass extends S1_BaseClass {
		
			public static void main(String[] args) throws InterruptedException {
				
				S3_RunnerClass S3 = new S3_RunnerClass();
				
				com.Stage3_BaseClass.Page_Object_Manager POMA = new com.Stage3_BaseClass.Page_Object_Manager();
				
				S3.getDriver(POMA.getData().getBrowser_Data());
				S3.getUrl(POMA.getData().getUrl_Data());
				S3.Click(POMA.getWebElemnt().getSignIn_btn());
				S3.Click(POMA.getWebElemnt().getSignMobile_btn());
				S3.Wait_ImplicitWait();
				S3.Click(POMA.getWebElemnt().getMbInputBox());
				S3.sendKeys(POMA.getWebElemnt().getMbInputBox(), POMA.getData().getPhone_Data());
				S3.Click(POMA.getWebElemnt().getProceedBtn());
				S3.Click(POMA.getWebElemnt().getOtpField());
				Thread.sleep(15000);
				S3.Click(POMA.getWebElemnt().getVerifyBtn());


/*
				S3.getDriver(com.Stage3_BaseClass.Page_Object_Manager.getPom_mag().
				S3.getDriver(POMA.getPom_mag().getDCM().launchBrowser_Data());
				S3.getUrl(com.Stage3_BaseClass.Page_Object_Manager.getPom_mag().getDCM().launchUrl_Data());
				S3.Wait_ImplicitWait();
				S3.Click(com.Stage3_BaseClass.Page_Object_Manager.getPom_mag().getPom().getSignIn_btn());
				S3.Click(com.Stage3_BaseClass.Page_Object_Manager.getPom_mag().getPom().getSignMobile_btn());
				S3.Click(com.Stage3_BaseClass.Page_Object_Manager.getPom_mag().getPom().getMbInputBox());
				S3.sendKeys(com.Stage3_BaseClass.Page_Object_Manager.getPom_mag().getPom().getMbInputBox(), com.Stage3_BaseClass.Page_Object_Manager.getPom_mag().getDCM().getPhone_Data());
				S3.Click(com.Stage3_BaseClass.Page_Object_Manager.getPom_mag().getPom().getProceedBtn());
				S3.Click(com.Stage3_BaseClass.Page_Object_Manager.getPom_mag().getPom().getOtpField());
				Thread.sleep(8000);
				S3.Click(com.Stage3_BaseClass.Page_Object_Manager.getPom_mag().getPom().getVerifyBtn());

				Login_WebElements_Implements WEB = new Login_WebElements_Implements();
				S3.Click(WEB.getSignIn_btn());
*/			
/*			DataConf_Reader DataReader = new DataConf_Reader();
				String launchBrowser_Data = DataReader.launchBrowser_Data();		System.out.println(launchBrowser_Data);
				String launchUrl_Data = DataReader.launchUrl_Data();				System.out.println(launchUrl_Data);
				String phone_Data = DataReader.getPhone_Data();						System.out.println(phone_Data);
				S3.getDriver(launchBrowser_Data);
				S3.getUrl(launchUrl_Data);
*/
				System.out.println("SignIn Sucessfull");
				
				Thread.sleep(5000);

				S3.Quit();
			}
}
