package com.Stage3_BaseClass;

public class DataConf_Reader {

	
	DataConf_Property DCP = new DataConf_Property();

		public String getBrowser_Data() {
			String Browser = DCP.get_property().getProperty("Browser_Name");
			return Browser;
		}
		
		public String getUrl_Data() {
			String Url = DCP.get_property().getProperty("Url");
			return Url;
		}
		
		public String getPhone_Data() {
			String PhoneNumber = DCP.get_property().getProperty("PhoneNumber");
			return PhoneNumber;
		}
}
