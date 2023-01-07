import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class Run {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        Cases obj1 = new Cases();
        obj1.Men();
        obj1.selectproduct("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/a/span/span/img",
                "//*[@id=\"option-label-size-143-item-175\"]", "//*[@id=\"option-label-color-93-item-49\"]");
        obj1.selectproduct("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[5]/div/a/span/span/img",
                "//*[@id=\"option-label-size-143-item-178\"]", "//*[@id=\"option-label-color-93-item-53\"]");
        obj1.billing();
        obj1.form();
        obj1.confirmation();
        // obj1.newfn();
    }
}