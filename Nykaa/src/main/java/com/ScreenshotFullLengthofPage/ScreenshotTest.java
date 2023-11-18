package com.ScreenshotFullLengthofPage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotTest {
	

		public static void main(String[] args) throws IOException {
			WebDriver d = new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://www.amazon.in/");
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Screenshot take = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(d);
			ImageIO.write(take.getImage(), "PNG", new File(System.getProperty("user.dir")+"\\src\\ScreenshotEvidance\\FullShot.png"));
			d.close();
		}
	}
