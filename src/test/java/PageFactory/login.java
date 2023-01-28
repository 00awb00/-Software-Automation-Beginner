package PageFactory;

import Methods.Base;
import org.testng.Assert;

public class login extends Base {

    public void Email(String path, String value){

        try{
            senddata(value, xpath(path));
        } catch (Exception ex){
            Assert.fail("Path/Email does not exist");
        }
    }

    public void Password(String path, String value){
        try{
            senddata(value, xpath(path));
        }catch (Exception ex){
            Assert.fail("Path/Password not found");
        }
    }

    public void Submit(String path){

        try{
            click(xpath(path));
        }catch (Exception ex){
            Assert.fail("Button does not exist");
        }
    }
}
