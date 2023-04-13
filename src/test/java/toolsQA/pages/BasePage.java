package toolsQA.pages;

import org.openqa.selenium.support.PageFactory;
import toolsQA.utilities.Driver;

public abstract class BasePage {
public BasePage(){
    PageFactory.initElements(Driver.get(), this);
}
}
