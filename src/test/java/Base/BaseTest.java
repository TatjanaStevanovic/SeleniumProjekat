package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait webDriverWait;
    public HomePage homePage;
    public ElementsPage elementsPage;
    public FormsPage formsPage;
    public AlertsFramePage alertsframePage;
    public WidgetsPage widgetsPage;
    public InteractionsPage interactionsPage;
    public BookStorePage bookStorePage;
    public String homePageURL;
    public ExcelReader excelReader;


    // Uvod:tokom testiranja koristim IntelliJ Idea u kome kreiram Maven projekat jer mi je lakse da radim preko pom fajlova.
    //Prilikom testiranja sajta koristim POM jer mi je preglednije za rad.
    //Testiram sajt:https://demoqa.com/
    //Iznad sam deklarisala sve stranice koje cu da testiram.
    //Koristim Excel tabelu za pokretanje sajta (URL adresa) i ubacivanje validnih informacija kao sto su ime i prezime,email adresa i sl.
    //Putanja koju sam prosledila za citanje excel fajla je jedinstvena za moj racunar i mora da se promeni ako se testira na drugom racunaru.
    //Koristim TestNG i zato stavljam Before class koji se izvrsava samo jednom pre pocetka testiranja.

    @BeforeClass
    public void setUp()throws IOException{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage=new HomePage(driver,webDriverWait);
        excelReader=new ExcelReader("C:\\Users\\hp\\Desktop\\DataTest.xlsx");
        homePageURL= excelReader.getStringData("Login",1,4);
        elementsPage=new ElementsPage(driver,webDriverWait);
        formsPage=new FormsPage(driver,webDriverWait);




    }
    public void visibilityWait(WebElement element){
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }
    public void clickabilityWait(WebElement element){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }
    @AfterClass
public void tearDown(){
        //driver.close();
        //driver.quit();
    }
    }




