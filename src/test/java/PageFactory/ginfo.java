package PageFactory;

import Methods.Base;

public class ginfo extends Base {
    public void toclick(String path){
        click(xpath(path));
    }

    public void sendinfo(String data, String path) {
        click(xpath(path));
        cleartext(xpath(path));
        senddata(data, xpath(path));
        cleartext(xpath(path));
    }

    public void back() {
        goback();
    }
}
