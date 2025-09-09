package HooksPKG;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass
{
        @Before
        public void browserOpen()
        {
            System.out.println("Browser opened");
        }

        @After
        public void BrowserClose()
        {
            System.out.println("Browser close");
        }


}
