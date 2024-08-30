package demo.pages.home;

import net.serenitybdd.core.pages.ResolvableElement;
import org.openqa.selenium.By;

public class HomeElements {
    public static final By TITLE = By.xpath("//h1[text()=\"Logged In Successfully\"]");
    public static final By LOGIN_BUTTON = By.cssSelector("#submit");
    public static final By USERNAME = By.cssSelector("#username");
    public static final By PASSWORD = By.cssSelector("#password");
}
