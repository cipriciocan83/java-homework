package login;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.MyAccountPage;
import static org.testng.Assert.*;

@Test
public class LoginTest extends BaseTest {

    public void testSuccessfullLogin(){

        MyAccountPage myAccountPage = homepage.clickMyAccountButton();
        myAccountPage.setUsername("qaworkshopsv@mailinator.com");
        myAccountPage.setPassword("QAWorkshopSV1!");
        DashboardPage dashboardPage = myAccountPage.clickLoginButton();
        assertTrue(dashboardPage.getAlertText().contains(
                "Log out"),
                "You are not logged in!");
    }

}
