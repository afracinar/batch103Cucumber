package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazoNPage {

    public AmazoNPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='s-image'])[1]")
    public WebElement ilkFoto;

    @FindBy(xpath = "(//*[@class='s-image'])[2]")
    public WebElement ikinciFoto;

}
