package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage {
    WebDriver driver;
    WebDriverWait webDriverWait;
    WebElement TextBox;
    WebElement FullName;
    WebElement Email;
    WebElement CurrentAddress;
    WebElement SubmitButton;
    WebElement CheckBox;
    WebElement HomeButton;
    WebElement RadioButton;
    WebElement YesButton;
    WebElement ImpressiveButton;
    WebElement WebTablesButton;
    WebElement AddButton;
    WebElement FirstName;
    WebElement LastName;
    WebElement EmailAddress;
    WebElement Age;
    WebElement Salary;
    WebElement Department;
    WebElement Submit;


    public ElementsPage(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    public WebElement getTextBox() {

        return driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
    }

    public WebElement getFullName() {

        return driver.findElement(By.xpath("//*[@id=\"userName\"]"));
    }

    public WebElement getEmail() {

        return driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
    }

    public WebElement getCurrentAddress() {

        return driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
    }

    public WebElement getSubmitButton() {

        return driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    }

    public WebElement getCheckBox() {

        return driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
    }

    public WebElement getHomeButton() {

        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-uncheck"));
    }

    public WebElement getRadioButton() {

        return driver.findElement(By.xpath("//*[@id=\"item-2\"]/span"));
    }

    public WebElement getYesButton() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
    }

    public WebElement getImpressiveButton() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
    }

    public WebElement getWebTablesButton() {

        return driver.findElement(By.xpath("//*[@id=\"item-3\"]/span"));
    }

    public WebElement getAddButton() {

        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getFirstName() {

        return driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
    }

    public WebElement getLastName() {

        return driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
    }

    public WebElement getEmailAddress() {

        return driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
    }

    public WebElement getAge() {

        return driver.findElement(By.xpath("//*[@id=\"age\"]"));
    }

    public WebElement getSalary() {

        return driver.findElement(By.xpath("//*[@id=\"salary\"]"));
    }

    public WebElement getDepartment() {

        return driver.findElement(By.xpath("//*[@id=\"department\"]"));
    }

    public WebElement getSubmit() {

        return driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    }

    public WebElement getBin() {
        return driver.findElement(By.xpath("//*[@id=\"delete-record-4\"]/svg"));
    }
    //---------------------------------------------------------------------------

    public void clickOnTextBox(){

        this.getTextBox().click();

    }
    public void insertFullName(String FullName){
        this.getFullName().clear();
        this.getFullName().sendKeys(FullName);
    }
    public void insertEmail(String Email){
        this.getEmail().clear();
        this.getEmail().sendKeys(Email);
    }
    public void insertCurrentAddress(String CurrentAddress){
        this.getCurrentAddress().clear();
        this.getCurrentAddress().sendKeys(CurrentAddress);
    }
    public void clickOnSubmitButton(){

        this.getSubmitButton().click();
    }
    public void clickOnCheckButton(){

        this.getCheckBox().click();
    }
    public void clickOnHomeButton(){

        this.getHomeButton().click();
    }
    public void clickOnRadioButton(){

        this.getRadioButton().click();
    }
    public void clickOnYesButton() {

        this.getYesButton().click();
    }
    public void clickOnImpressiveButton(){

        this.getImpressiveButton().click();
    }
    public void clickOnWebTablesButton(){
        this.getWebTablesButton().click();
    }
    public void clickOnAddButton(){
        this.getAddButton().click();
    }
    public void insertFirstName(String FirstName){
        this.getFirstName().clear();
        this.getFirstName().sendKeys(FirstName);
    }
    public void insertLastName(String LastName){
        this.getLastName().clear();
        this.getLastName().sendKeys(LastName);
    }
    public void insertEmailAddress(String EmailAddress){
        this.getEmailAddress().clear();
        this.getEmailAddress().sendKeys(EmailAddress);
    }
    public void insertAge(int Age){
        this.getAge().clear();
        this.getAge().sendKeys("25");
    }
    public void insertSalary(int Salary){
        this.getSalary().clear();
        this.getSalary().sendKeys("10000");
    }
    public void insertDepartment(String Department){
        this.getDepartment().clear();
        this.getDepartment().sendKeys(Department);
    }
    public void clickOnSubmit(){
        this.getSubmit().click();
    }

    }







