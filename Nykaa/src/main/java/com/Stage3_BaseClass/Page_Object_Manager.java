package com.Stage3_BaseClass;

import com.Stage2_BaseClass.Login_01Implements;

public class Page_Object_Manager extends Login_01Implements{
			
		public Login_WebElements_Implements WebElemnt ;		// Login_WebElements_Implements pom = new Login_WebElements_Implements();
		public DataConf_Reader Data;						// DataConf_Reader DCM = new DataConf_Reader();
		public Page_Object_Manager POM;
			
			public Login_WebElements_Implements getWebElemnt() {
				if (WebElemnt == null) {
					WebElemnt = new Login_WebElements_Implements();
				}
				return WebElemnt;
			}

			public DataConf_Reader getData() {
				if (Data == null) {
					Data = new DataConf_Reader();
				}
				return Data;
			}
			public Page_Object_Manager getPOM() {
				if (POM == null) {
					POM = new Page_Object_Manager();
				}
			return POM;
			}

}
