package com.Stage3_BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataConf_Property {
			FileInputStream fi;
			
			public Properties get_property() {
				File file = new File("C:\\Users\\Public\\Jdk\\Nykaa\\src\\main\\java\\com\\Stage3_BaseClass\\config.properties");
				try {
					fi = new FileInputStream(file);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				Properties prop = new Properties();
				try {
					prop.load(fi);
				} catch (IOException e) {
					e.printStackTrace();
				}
				return prop;
			}
}
