package demo.pages.home;

import demo.utils.common.Wait;
import demo.utils.config.UserConfig;
import demo.utilsCommon.ui.UIAction;
import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import net.thucydides.core.pages.PageObject;

public class Home extends PageObject {

    public HomeValidations validate;

    public Home() {
        validate = new HomeValidations(this);
    }

    public Home login(String userRole) {
        login(UserConfig.getUsername(userRole), UserConfig.getPassword(userRole));
        Wait.forPageToLoad();
        return new Home();
    }

    private void login(String username, String password) {
        insertCredentials(username, password);
        UIAction.click(HomeElements.LOGIN_BUTTON);

        Wait.forPageToLoad();
    }

    private void insertCredentials(String username, String password) {
        UIAction.input(HomeElements.USERNAME, username);
        UIAction.input(HomeElements.PASSWORD, password);
    }
}
