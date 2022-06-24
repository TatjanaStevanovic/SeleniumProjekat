package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTest extends BaseTest {

    String FullName="Tatjana";
    String Email="tatjanastevanovi@yahoo.com";
    String CurrentAddress="Cara Dusana 15";
    String FirstName="Milica";
    String LastName="Mitic";
    String EmailAddress="milicamit@yahoo.com";
    int Age=25;
    int Salary=10000;
    String Department="Srbija";



    @BeforeMethod

    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.navigate().to(homePageURL);
    }

    @Test

    public void successfulLogin()throws InterruptedException{
        homePage.clickOnElementsButton();
        elementsPage.clickOnTextBox();
        String fullName= excelReader.getStringData("Login",1,0);
        String email= excelReader.getStringData("Login",1,1);
        String currentAddress= excelReader.getStringData("Login",1,3);
        elementsPage.insertFullName(FullName);
        elementsPage.insertEmail(Email);
        elementsPage.insertCurrentAddress(CurrentAddress);
        elementsPage.clickOnSubmitButton();

        Assert.assertTrue(elementsPage.getTextBox().isDisplayed());


        elementsPage.clickOnCheckButton();
        elementsPage.clickOnHomeButton();
        elementsPage.clickOnRadioButton();
        elementsPage.clickOnYesButton();
        elementsPage.clickOnImpressiveButton();

        Assert.assertTrue(elementsPage.getRadioButton().isDisplayed());

        elementsPage.clickOnWebTablesButton();
        elementsPage.clickOnAddButton();

        String FirstName= excelReader.getStringData("Login",1,7);
        String LastName= excelReader.getStringData("Login",1,8);
        String EmailAddress= excelReader.getStringData("Login",1,9);
        int Age=excelReader.getIntegerData("Login",1,10);
        int Salary= excelReader.getIntegerData("Login",1,11);
        String Department= excelReader.getStringData("Login",1,12);
        elementsPage.insertFirstName(FirstName);
        elementsPage.insertLastName(LastName);
        elementsPage.insertEmailAddress(EmailAddress);
        elementsPage.insertAge(Age);
        elementsPage.insertSalary(Salary);
        elementsPage.insertDepartment(Department);
        elementsPage.clickOnSubmit();
        scrollIntoView(formsPage.getPracticeForm());

        homePage.clickOnFormsButton();
        formsPage.clickOnPracticeForm();

    }

    }



