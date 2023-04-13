package toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import toolsQA.utilities.BrowserUtils;
import toolsQA.utilities.Driver;

public class DashBoardPage extends BasePage{

private void navigateBaseMenu(String menu){

    WebElement element= Driver.get().findElement(By.xpath("//h5[text()='"+menu+"']"));
  //  element.click();
    BrowserUtils.clickWithJS(element);

}

public void navigateSubMenu(String subMenu){

    WebElement subelement= Driver.get().findElement(By.xpath("//h5[text()='"+subMenu+"']"));
    subelement.click();
}
}
