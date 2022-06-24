package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormsPage {
    WebDriver driver;
    WebDriverWait webDriverWait;

    WebElement PracticeForm;
    WebElement FirstName;
    WebElement LastName;
    WebElement Email;
    WebElement Male;
    WebElement Mobile;
    WebElement DateOfBirth;
    WebElement Date;
    WebElement Month;
    WebElement Year;
    WebElement Subjects;
    WebElement Music;
    WebElement CurrentAddress;

    public FormsPage(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    public WebElement getPracticeForm() {

        return driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail-wrapper"));
    }

    public WebElement getMale() {
        return driver.findElement(By.id("gender-radio-1"));
    }

    public WebElement getMobile() {
        return driver.findElement(By.id("userNumber"));
    }

    public WebElement getDateOfBirth() {
        return driver.findElement(By.id("dateOfBirthInput"));
    }

    public WebElement getDate() {
        return driver.findElement(By.className("react-datepicker__day react-datepicker__day--023 react-datepicker__day--selected react-datepicker__day--today"));
    }

    public WebElement getMonth() {
        return driver.findElement(By.className("react-datepicker__month-select"));
    }

    public WebElement getYear() {
        return driver.findElement(By.className("react-datepicker__year-select"));
    }

    public WebElement getSubjects() {
        return driver.findElement(By.className("subjects-auto-complete__control css-yk16xz-control"));
    }

    public WebElement getMusic() {
        return driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    //-----------------------------------------------------------------
    public void clickOnPracticeForm(){
        this.getPracticeForm().click();
    }

}




