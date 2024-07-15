package hu.masterfield.browser;

public class WebBrowserSetting {
    private  final static String pathToGeckoDriver = "C:\\DT\\WebBrowsers\\FirefoxDriver\\126\\geckodriver.exe";
    private  final static String pathToFirefox = "C:\\DT\\WebBrowsers\\FireFoxBin\\126\\FirefoxPortable\\App\\Firefox64\\firefox.exe";
    private  final static String pathToChromeDriver = "C:\\DT\\WebBrowsers\\ChromeDriver\\125\\chromedriver.exe";
    private  final static String pathToChrome = "C:\\DT\\WebBrowsers\\ChromeBin\\125\\GoogleChromePortable\\App\\Chrome-bin\\chrome.exe";
    private  final static String baseURL = "https://go.bkk.hu/";
    private  final static String pathToScreenshots = "c:\\DT\\Screenshots\\";

    public static String getPathToGeckoDriver() {
        return pathToGeckoDriver;
    }

    public static String getPathToFirefox() {
        return pathToFirefox;
    }

    public static String getPathToChromeDriver() {
        return pathToChromeDriver;
    }

    public static String getPathToChrome() {
        return pathToChrome;
    }

    public static String getBaseURL() {
        return baseURL;
    }

    public static String getPathToScreenshots() {
        return pathToScreenshots;
    }
}

