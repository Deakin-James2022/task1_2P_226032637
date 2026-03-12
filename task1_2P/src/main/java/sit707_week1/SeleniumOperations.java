package sit707_week1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
public class SeleniumOperations {
	public static void sleep(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/*
	 * Create and return Chrome driver
	 */
	public static WebDriver createDriver() {
		System.setProperty(
				"webdriver.chrome.driver",
				"\\SIT707\\SIT707OnTrack\\1_2P\\chromedriver144_0_7559_133\\chromedriver.exe");

		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		System.out.println("Driver info: " + driver);
		return driver;
	}
	
	/*
	 * Required task implementation
	 */
	public static void open_chrome_loadpage_resize_close() {
		// A. Modify Hello message
		System.out.println("Hello from 226032637, JUNJIELU");
		// Start browser
		WebDriver driver = createDriver();
		sleep(2);
		/*
		 * B. Open Google
		 */
		System.out.println("Opening Google...");
		driver.get("https://www.google.com");
		sleep(2);
		/*
		 * C. Resize to 640x480
		 */
		System.out.println("Resize browser to 640x480");
		driver.manage().window().setSize(new Dimension(640, 480));
		sleep(2);
		/*
		 * D. Resize to 1280x960
		 */
		System.out.println("Resize browser to 1280x960");
		driver.manage().window().setSize(new Dimension(1280, 960));
		sleep(2);
		// Close browser
		System.out.println("Closing browser...");
		driver.close();
	}
}
