package HomeWork9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPage {

    private static final String MAIN_PAGE_URL ="http://automationpractice.com";
    private WebDriver driver;

    private By signIn = By.xpath("xpath=//a[contains(text(),'Sign in')]");
    private By emailField = By.id("id=email_create");
    private By accountButton = By.xpath("//button[@id='SubmitCreate']/span");
    private By gender = By.id("id=id_gender1");
    private By custFirstName = By.id("id=customer_firstname");
    private By custLastName = By.id("id=customer_lastname");
    private By emailRegistr = By.id("id=email");
    private By pass = By.id("id=passwd");
    private By firstName = By.id("id=firstname");
    private By lastName = By.id("id=lastname");
    private By companyName = By.xpath("//input[@id='company']");
    private By addressData = By.xpath("//input[@id='address1']");
    private By cityName = By.xpath("//input[@id='city']");
    private By postCode = By.xpath("//input[@id='postcode']");
    private By phoneMobile = By.xpath("//input[@id='phone_mobile']");
    private By alias = By.xpath("//input[@id='alias']");
    private By registr = By.xpath("//span[contains(.,'Register')]");
    private By alertMes = By.xpath("//div[@id='center_column']/div");


    public TestPage(WebDriver driver) {
        this.driver = driver;
    }

    public TestPage openMainPage(){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public TestPage openRegistetionForm(){
        this.driver.findElement(signIn).click();
        return this;
    }

    public void enterEmail (){
        this.driver.findElement(emailField).sendKeys("tyschenko.evgeniy57@gmail.com");
    }

    public TestPage createAccount (){
        this.driver.findElement(accountButton).click();
        return this;

    }
    public TestPage chooseGender () {
        this.driver.findElement(gender).click();
        return this;
    }
    public void enterFirstName () {
        this.driver.findElement(custFirstName).sendKeys("Saler");

    }
    public void enterLastName () {
        this.driver.findElement(custLastName).sendKeys("John ");

    }
    public void enterEmailAgain () {
        this.driver.findElement(emailRegistr).sendKeys("tyschenko.evgeniy57@gmail.com");

    }
    public void firstName (){
        this.driver.findElement(firstName).sendKeys("Yevhen");

    }
    public void lastName (){
        this.driver.findElement(lastName).sendKeys("Yevhen");
    }
    public void company (){
        this.driver.findElement(companyName).sendKeys("CT");

    }
    public void address (){
        this.driver.findElement(addressData).sendKeys("address");

    }
    public void city (){
        this.driver.findElement(cityName).sendKeys("Kiew");

    }
    public void zipPostal (){
        this.driver.findElement(postCode).sendKeys("Post Code");

    }
    public void mobile (){
        this.driver.findElement(phoneMobile).sendKeys("+380670000000");

    }
    public void aliasForFutureReference (){
        this.driver.findElement(alias).sendKeys("alias");

    }
    public TestPage registration (){
        this.driver.findElement(registr).click();
        return this;
    }

    public boolean error (){
        return this.driver.findElement(alertMes).isDisplayed();
    }
}
