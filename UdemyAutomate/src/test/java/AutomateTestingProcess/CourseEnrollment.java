package AutomateTestingProcess;

import BaseTest.BaseTestClass;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CourseEnrollment extends BaseTestClass {
    @BeforeMethod
    public void login() throws Exception {
        openBrowserAndNavigate();

    }
    @Test
    public void enrollment() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.landOnLogin();
        HomePage home = new HomePage();

    }
}
