package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private By inputFirstName = By.xpath("//input[@ng-model='FirstName']");
    private By inputLastName = By.xpath("//input[@ng-model='LastName']");
    private By inputAddress = By.xpath("//textarea[@ng-model='Adress']");
    private By inputEmailAddress = By.xpath("//input[@type = 'email']");
    private By inputPhoneNumber = By.xpath("//input[@type = 'tel']");
    private By maleGender = By.xpath("//input[@value='Male']");
    private By femaleGender = By.xpath("//input[@value='FeMale']");
    private By cricketCheckmark = By.id("checkbox1");
    private By moviesCheckmark = By.id("checkbox2");
    private By hockeyCheckmark = By.id("checkbox3");

    public void typeInFirstName(String fName) {
        LOG.info("Type in FirstName");
        driver.findElement(inputFirstName).sendKeys(fName);
    }

    public void typeInLastName(String lName) {
        LOG.info("Type in LastName");
        driver.findElement(inputLastName).sendKeys(lName);
    }

    public void typeInAdress(String address) {
        LOG.info("Type in Address");
        driver.findElement(inputAddress).sendKeys(address);
    }

    public void typeInEmailAddress(String emailAddress) {
        LOG.info("Type in Email Address");
        driver.findElement(inputEmailAddress).sendKeys(emailAddress);
    }

    public void typeInPhoneUmber(String phoneNumber) {
        LOG.info("Type in Phone NUmber");
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
    }

    public void setMaleGender() {
        LOG.info("Click the Male radio button");
        driver.findElement(maleGender).click();
    }

    public void setFemaleGender() {
        LOG.info("Click the Female  radio button");
        driver.findElement(femaleGender).click();
    }

    public void setCricket() {
        LOG.info("Set Cricket");
        driver.findElement(cricketCheckmark).click();
    }

    public void seMovies() {
        LOG.info("Set Movies");
        driver.findElement(moviesCheckmark).click();
    }

    public void setHockey() {
        LOG.info("Set Hockey");
        driver.findElement(hockeyCheckmark).click();
    }

}
