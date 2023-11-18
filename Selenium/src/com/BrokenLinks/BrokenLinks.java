package com.BrokenLinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	static WebDriver driver;
	
	static int bc;
	static int vc;
	
	public static void brokenLinks(String url) throws IOException {
		try {
			URL u = new URL(url);
			HttpsURLConnection oc = (HttpsURLConnection) u.openConnection();
			oc.setConnectTimeout(5000);
			oc.connect();
			
			if (oc.getResponseCode() >= 400) {
				System.err.println(url + "  " + oc.getResponseCode() +"  "+ oc.getResponseMessage()+ "  is a broken link");
				bc++;
			}
			else {
				System.out.println(url + "  " + oc.getResponseCode() +"  "+ oc.getResponseMessage()+ "  is a valid link");
				vc++;
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		
	}
	
	public static void main (String [] args) throws IOException {
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int totalLinksCount = links.size();
		
//		for (WebElement all_links : links) {
//			System.out.println(all_links);
//		}
		
		for (int i = 0; i < totalLinksCount; i++) {
			WebElement link = links.get(i);
			String url = link.getAttribute("href");
			brokenLinks(url);
			System.out.println(url);
		}
		System.out.println();
		System.out.println("Total Links in WebPage\t: " + totalLinksCount);;
		System.out.println("Total Broken Links\t: " + bc);
		System.out.println("Total valid Links\t: " + vc);;
		
		driver.close();
		
	}

}
