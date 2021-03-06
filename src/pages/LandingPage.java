package pages;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pages.FlightsSearchPage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LandingPage {
	WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }



    public FlightsSearchPage goToFlightsSearchPage() {
        driver.findElement(By.linkText("Flights")).click();
        return new FlightsSearchPage(driver);
}
}
