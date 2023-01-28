package PageFactory;

import Methods.Base;

public class location extends Base {
    public void SearchEdit(String path, String data) {
        click(xpath(path));
        senddata(data, xpath(path));
    }

    public void toclick(String path) {
        click(xpath(path));
    }

    public void back() {
        goback();
    }
}
