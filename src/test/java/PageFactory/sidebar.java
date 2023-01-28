package PageFactory;

import Methods.Base;

public class sidebar extends Base {
    public void sidebar(String path) {
        click(xpath(path));
    }
}
