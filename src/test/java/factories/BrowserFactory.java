package factories;

import com.google.common.base.Supplier;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {

 public static final Supplier<WebDriver> chrome = () -> {
     System.setProperty("webdriver.chrome.driver","C:/Tools/webdrivers/chromedriver.exe");
     return new ChromeDriver();
  };

 private static final Map<String, Supplier<WebDriver>> MAP = new HashMap<>();

 static {
     MAP.put("chrome",chrome);

 }

 public static WebDriver getDriver(String browser){
     return MAP.get(browser).get();

 }




}
