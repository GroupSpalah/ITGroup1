package homeworks.mihail_chursinov.hw_02_05_23;

public class Test {
    public static void main(String[] args) {
        WebDriver chromeDriver = new ChromeDriver();
        FirefoxDrive firefoxDrive = new FirefoxDrive();
        SafariDriver safariDriver = new SafariDriver();
        chromeDriver.getTitle();
        firefoxDrive.close();
        safariDriver.getTitle();
    }
}
