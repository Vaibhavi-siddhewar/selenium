package test1.selenium;

import java.time.Duration;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class newtabnewwindow {

    EdgeDriver driver;

    void launch() {
        System.setProperty("webdriver.edge.driver",
                "C:\\vaibhavicorejava\\selenium\\driver_resources\\msedgedriver.exe");

        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.in/");
    }

    void newtab() {

        // Open new TAB
        driver.switchTo().newWindow(WindowType.TAB);

        // Now navigate in new tab
        driver.get("https://www.unipune.ac.in/");

        // Open another TAB
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.fortunecloudeindia.com/leadership-awards-2026");
    }

    void newwindow() {

        // Open new WINDOW
        driver.switchTo().newWindow(WindowType.WINDOW);

        // Corrected URL
        driver.get("https://socialoffline.in/restaurant/fc-road-social/");

        driver.quit();
    }

    public static void main(String[] args) {

        newtabnewwindow n = new newtabnewwindow();
        n.launch();
        n.newtab();
        n.newwindow();
    }
}