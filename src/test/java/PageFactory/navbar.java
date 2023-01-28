package PageFactory;

import Methods.Base;

public class navbar extends Base {


    public void option(String path) {
        click(xpath(path));
    }

    public void ddoption(String path) {
        click(xpath(path));
    }
}
