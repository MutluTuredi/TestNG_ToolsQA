package toolsQA.tests.DemoWebSiteTest;

import org.testng.annotations.Test;
import toolsQA.tests.TestBase;
import toolsQA.utilities.ConfigurationReader;

public class DemoTest extends TestBase {

    @Test
    public void test1() {
       driver.get(ConfigurationReader.get("url"));

    }
}
