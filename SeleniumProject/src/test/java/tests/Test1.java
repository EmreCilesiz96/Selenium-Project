package tests;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;


public class Test1 {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alpha\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        ///////////////////// Textbox Control Part ///////////////////////

//        driver.get("https://demoqa.com/text-box");
//        driver.manage().window().maximize();

//        WebElement fullName = driver.findElement(By.id("userName"));
//          fullName.click();
//          fullName.sendKeys("Mustafa");

//      WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
//          email.click();
//          email.sendKeys("mustafa1234@gmail.com");

//      WebElement currentAddress = driver.findElement(new By.ByCssSelector(".form-control[placeHolder='Current Address']"));
//          currentAddress.click();
//          currentAddress.sendKeys("Ankara,Türkiye");

//      WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
//          try {
//              Thread.sleep(2000);                //2 second.
//          }
//              catch(InterruptedException ex) {
//              Thread.currentThread().interrupt();
//          }
//          permanentAddress.click();
//          permanentAddress.sendKeys("Ankara,Türkiye");

//          WebElement submitButton = driver.findElement(new By.ByCssSelector("button.btn"));
//          submitButton.click();

        /////////////////////// Textbox Sumbit-Click Control Part ///////////////////////

//        WebElement nameText = driver.findElement(By.xpath("//div/p[@id='name']"));
//          String name =nameText.getText();
//         System.out.println(name);


        /////////////////////// CheckBox Control Part ///////////////////////

//        driver.get("https://demoqa.com/checkbox");
//        driver.manage().window().maximize();


//       String homeCheckBoxCssValue = "label[for = 'tree-node-home'] span.rct-checkbox svg";
//        WebElement homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
//        homeCheckBox.click();

//        homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));

//        String homeCheckBoxClassName = homeCheckBox.getAttribute("class");

//        if (homeCheckBoxClassName.equals("rct-icon rct-icon-check")){
//            System.out.println(("CheckBox is checked!"));
//        }
//        else {
//            System.out.println(("CheckBox is unchecked!"));
//        }
        /////////////////////// Practice CheckBox Part ///////////////////////

//        driver.get("https://demoqa.com/automation-practice-form ");
//        driver.manage().window().maximize();

//        WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
//        boolean isEnabled =sportCheckbox.isEnabled();
//        System.out.println(isEnabled);

//        WebElement sportCheckboxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));

//        if(isEnabled){
//            try {
//                sportCheckbox.click();
//            }
//            catch (ElementClickInterceptedException e){
//                sportCheckboxLabel.click();
//                System.out.println("Entered catch block!");

//            }
//              }
//            boolean isSelected = sportCheckbox.isSelected();
//            System.out.println(isSelected);

        /////////////////////// RadioButton Control Part ///////////////////////
//        driver.get("https://demoqa.com/radio-button");
//        driver.manage().window().maximize();
//        WebElement yesRadioButtonLabel = driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
//        boolean isEnabled = yesRadioButtonLabel.isEnabled();
//        if(isEnabled){
//            yesRadioButtonLabel.click();
//            System.out.println("Clicked yesRadio button.");
//        }

//        WebElement yesRadioButton = driver.findElement(By.id("yesRadio"));

//        boolean isSelected = yesRadioButton.isSelected();
//        if(isSelected){
//            System.out.println("yesRadioButton Selected!");
//        }

//        WebElement output = driver.findElement(new By.ByCssSelector("p.mt-3"));
//        System.out.println(output.getText());

//        WebElement noRadioButton = driver.findElement(By.id("noRadio"));
//        System.out.println(noRadioButton.isEnabled());


        /////////////////////// RadioButton Control Part ///////////////////////

//        driver.get("https://demoqa.com/buttons");
//        driver.manage().window().maximize();
//
//        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
//
//        Actions action = new Actions(driver);
//        action.doubleClick(doubleClickButton).perform();
//
//        WebElement message = driver.findElement(By.id("doubleClickMessage"));
//        String messageText = message.getText();
//        System.out.println(messageText);
//
//        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
//
//        Actions rightClickAction = new Actions(driver);
//        rightClickAction.contextClick(rightClick).perform();
//
//        WebElement contexRightClickMessage = driver.findElement(By.id("rightClickMessage"));
//        String contexClickMessage = contexRightClickMessage.getText();
//        System.out.println(contexClickMessage);

        /////////////////////// Dynamic Elements Control Part ///////////////////////

//        driver.get("https://demoqa.com/buttons");
//        driver.manage().window().maximize();

//      //div/button[starts-with(text(), 'Click Me')] Xpath Kullanimi ile Yontem 1
//      WebElement dynamicClickButton = driver.findElement(By.xpath("//div/button[starts-with(text(), 'Click Me')]"));
//      //div[last()]/button Xpath Kullanimi ile Yontem 2
//        WebElement dynamicClickButton = driver.findElement(By.xpath("//div[last()]/button"));
//        dynamicClickButton.click();

        /////////////////////// Dynamic Properties Control Parts ///////////////////////

//        driver.get("https://demoqa.com/dynamic-properties");
//        driver.manage().window().maximize();
//
//        WebElement textElement = driver.findElement(By.xpath("//div/p"));
//        String text = textElement.getText();
//        System.out.println(text);
//
//        WebElement firstButton = driver.findElement(By.id("enableAfter"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(firstButton));
//        firstButton.click();

//        driver.get("https://demoqa.com/dynamic-properties");
//        driver.manage().window().maximize();

//        WebElement colorChangeButton = driver.findElement(By.id("colorChange"));
//        String className = colorChangeButton.getAttribute("class");
//        System.out.println("Before Change:"+ className);
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.attributeToBe(colorChangeButton , "class", "mt-4 text-danger btn btn-primary"));
//        System.out.println("After Change:"+ className);

//         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//         wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
//         driver.findElement(By.id("visibleAfter")).click();



//        /////////////////////// Broken Links Control Parts ///////////////////////

//                      ValidLink


//        driver.get("https://demoqa.com/broken");
//        driver.manage().window().maximize();

//        HttpClient client = HttpClientBuilder.create().build();
//        HttpGet request = new HttpGet("https://demoqa.com/");
//        HttpResponse response = client.execute(request);
//        int statusCode = response.getStatusLine().getStatusCode();
//        System.out.println(statusCode);

//                      BrokenLink

//        HttpClient client = HttpClientBuilder.create().build();
//        HttpGet request = new HttpGet("http://the-internet.herokuapp.com/status_codes/500");
//        HttpResponse response = client.execute(request);
//        int statusCode = response.getStatusLine().getStatusCode();
//        System.out.println(statusCode);

//                      Valid İmage

        //**Site kırık bir image eklemediği için statusCode 200 dönmektedir**//

//        WebElement validImage = driver.findElement(By.xpath("//div/Img[2]"));
//        String validImageUrl = validImage.getAttribute("src");
//        System.out.println(validImageUrl);
//
//        HttpClient client = HttpClientBuilder.create().build();
//        HttpGet request = new HttpGet(validImageUrl);
//        HttpResponse response = client.execute(request);
//        int statusCode = response.getStatusLine().getStatusCode();
//        System.out.println(statusCode);
//        if(statusCode == 200){
//            System.out.println("Valid Image!");
//        } else if (statusCode == 500) {
//            System.out.println("Broken Image!");
//        }

//      /////////////////////// Download-Upload Control Parts ///////////////////////

//        driver.get("https://demoqa.com/upload-download");
//        driver.manage().window().maximize();

//        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
//        downloadButton.click();
//        String path = "C:\\Users\\Alpha\\Downloads";
//        String fileName ="sampleFile.jpeg";
//        Thread.sleep(5000);
//        boolean isDownloaded = isFileDownloaded(path, fileName);
//        System.out.println(isDownloaded);

//                                Upload

//        driver.get("https://demoqa.com/upload-download");
//        driver.manage().window().maximize();
//
//        WebElement uploadButton = driver.findElement(By.id("uploadFile"));
//        uploadButton.sendKeys("C:\\Users\\Alpha\\Desktop\\idea.ico");




    }
//    //////////////*****
//    public static boolean isFileDownloaded(String downloadPath, String fileName){
//        File file = new File(downloadPath);
//        File[] files = file.listFiles();
//
//        for(int i=0; i < files.length; i++){
//            if(files[i].getName().equals(fileName)){
//                return true;
//            }
//        }
//        return false;
//    }
//*****////////////// Bu kod bloğu *Download-Upload Control Parts* başlığı altındaki kod çalışmasında indirilen .jpeg dosyasının adres içerisinde arama yapılabilmesi için metot oluşturuldu.
}
