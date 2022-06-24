package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage{
    WebDriver driver;
    WebDriverWait webDriverWait;
    WebElement ElementsButton;
    WebElement FormsButton;
    WebElement AlertsButton;
    WebElement WidgetsButton;
    WebElement InteractionsButton;
    WebElement BookStoreButton;

    public HomePage(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }

    public WebElement getElementsButton() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]"));
    }

    public WebElement getFormsButton() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[1]"));
    }

    public WebElement getAlertsButton() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]/h5"));
    }

    public WebElement getWidgetsButton() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]/h5"));
    }

    public WebElement getInteractionsButton() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[3]/h5"));
    }

    public WebElement getBookStoreButton() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]/h5"));
    }
    //---------------------------------------------------------------------------------
    public void clickOnElementsButton(){

        this.getElementsButton().click();
    }
    public void clickOnFormsButton(){

        this.getFormsButton().click();
    }
    public void clickOnAlertsButton(){

        this.getAlertsButton().click();
    }
    public void clickOnWidgetsButton(){

        this.getWidgetsButton().click();
    }
    public void clickOnInteractionsButton(){

        this.getInteractionsButton().click();
    }
    public void clickOnBookStoreButton(){

        this.getBookStoreButton().click();
    }
}
