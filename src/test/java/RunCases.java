public class RunCases {
    public static void main(String[] args) throws InterruptedException {
        Cases obj1 = new Cases();
        obj1.Check();

        //obj1.CheckLogin();
        obj1.Login();
        obj1.CheckLogin();

        //obj1.LogOut();
        //obj1.CheckLogin();
        obj1.ForQuit();
    }
}
