package demo.tests.ui;

import demo.utils.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TC_UI_01_DEMO extends BaseTest {
    @Test
    @Title("TC_UI_01_DEMO_01_TEST: task1")
    public void TC_UI_01_DEMO_01_TEST() {
        step(1, "Login to Home Page Opens")
                .home.login("admin")
                .validate.verifyHomePageOpens();
        end();
    }
}