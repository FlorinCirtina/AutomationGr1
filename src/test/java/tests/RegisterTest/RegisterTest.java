package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.RegisterPage.RegisterPage;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class RegisterTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    private String newUrl = getBaseUrl() + "Register.html";

    String firstName = "Ion";
    String lAstName = "Pop";
    String adress = "Cluj, Strada Primaverii, Nt 407 J";
    String email = "Automation7@domain.com";
    String phone = "0748955748";

    @Test
    public void register() {
        driver.get(newUrl);

        LOG.info("Type in FullName");
        registerPage.typeInFirstName(firstName);
        registerPage.typeInLastName(lAstName);

        LOG.info("Type in Address");
        registerPage.typeInAdress(adress);

        LOG.info("Type Email address");
        registerPage.typeInEmailAddress(email);

        LOG.info("Type Phone NUmber");
        registerPage.typeInPhoneUmber(phone);

        LOG.info("Select Gender");
        registerPage.setMaleGender();
        registerPage.setFemaleGender();

        LOG.info("Select Hobbies");
        registerPage.setCricket();
        registerPage.seMovies();
        registerPage.setHockey();

    }
}
