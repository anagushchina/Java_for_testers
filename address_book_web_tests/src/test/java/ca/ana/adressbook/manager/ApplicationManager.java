package ca.ana.adressbook.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationManager {
    public WebDriver driver;
    private LoginHelper loginHelper;
    private GroupHelper groupHelper;

    public void initDriver(String browser) {
        if (driver == null) {
            if ("chrome".equals(browser)) {
                driver = new ChromeDriver();
            } else if ("firefox".equals(browser)) {
                driver = new FirefoxDriver();
            } else {
                throw new IllegalArgumentException(String.format("Unknown browser %s", browser));
            }
            Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));
            driver.get("http://localhost/addressbook/index.php");
            driver.manage().window().setSize(new Dimension(1440, 823));
            session().login("admin", "secret");
        }
    }

    public LoginHelper session(){
        if(loginHelper == null){
            loginHelper = new LoginHelper(this);
        }
        return loginHelper;
    }

    public GroupHelper groups(){
        if(groupHelper == null){
            groupHelper = new GroupHelper(this);
        }
        return groupHelper;
    }

    protected boolean isElementPresent(By locator) {
        try{
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception){
            return false;
        }
    }

}
