package tests;

import com.beust.ah.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class Test2 {

    WebDriver driver;

    @Test
    public void Test2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alpha\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();

//       ///////////////////////////// Browser-Windows Part /////////////////////////////
//        driver.get("https://demoqa.com/browser-windows");

//  driver.findElement(By.id("")); By.id içerisine "tabButton" yazıldığında New Tab-- "windowButton" yazıldığında New Window butonlarını işleme alır.
//  Özetle insert yapılan butonlardaki id seçimleri ile istenilen geri dönüş sağlanabilir.
//
//        WebElement tabButton = driver.findElement(By.id("windowButton"));
//        tabButton.click();
//
//        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
//
//        System.out.println(tabs.size());
//
//        driver.switchTo().window(tabs.get(1));
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        driver.close();

//       ///////////////////////////// Alerts Part /////////////////////////////

//                      Alert Button

//        driver.get("https://demoqa.com/alerts");
//        driver.findElement(By.id("alertButton")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.alertIsPresent());
//        driver.switchTo().alert().accept();

//                      Timer Alert Button

//        driver.get("https://demoqa.com/alerts");
//        driver.findElement(By.id("timerAlertButton")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
//        wait.until(ExpectedConditions.alertIsPresent());
//        driver.switchTo().alert().accept();

//                      Confirm Alert Button

//        driver.get("https://demoqa.com/alerts");
//        driver.findElement(By.id("confirmButton")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.alertIsPresent());
//        System.out.println(driver.switchTo().alert().getText());
//       ////// *******   driver.switchTo().alert().dismiss(); komutuyla ret işlemi sağlanmaktadır.   ******
//        driver.switchTo().alert().accept();

//                      Promt Button

//        driver.get("https://demoqa.com/alerts");
//        driver.findElement(By.id("promtButton")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.alertIsPresent());
//
//        Alert alert = driver.switchTo().alert();
//
//        System.out.println(alert.getText());
//
//       alert.sendKeys("Emre");
//       alert.accept();


//      ///////////////////////////// Frames Part /////////////////////////////

//        driver.get("https://demoqa.com/frames");
//
//        driver.switchTo().frame("frame1");
//
//
//        WebElement heading = driver.findElement(By.id("sampleHeading"));
//        String text = heading.getText();
//        System.out.println(text);
//
//        driver.switchTo().parentFrame();
//
//        List<WebElement> elementList = driver.findElements(By.cssSelector("div[id='framesWrapper'] div"));
//        String paragraph = elementList.get(0).getText();
//        System.out.println(paragraph);
//
//        driver.switchTo().frame("frame2");
//
//        WebElement heading2 = driver.findElement(By.id("sampleHeading"));
//        String text2 = heading2.getText();
//        System.out.println(text2);

//                      Frames 2

//        driver.get("https://demoqa.com/frames");
//
//        WebElement adFrame = driver.findElement(By.cssSelector("iframe[title='3rd party ad content']"));
//        driver.switchTo().frame(adFrame);
//
//        WebElement closeButton = driver.findElement(By.id("cbb"));
//        closeButton.click();


//      ///////////////////////////// Modal-Dialogs Part /////////////////////////////

//        driver.get("https://demoqa.com/modal-dialogs");

//        WebElement smallButton = driver.findElement(By.id("showSmallModal"));
//        smallButton.click();
//
//        WebElement modalText = driver.findElement(By.cssSelector("div.modal-body"));
//        System.out.println(modalText.getText());
//
//        WebElement smallCloseButton = driver.findElement(By.id("closeSmallModal"));
//        smallCloseButton.click();


//      ///////////////////////////// Accordian Part /////////////////////////////

//        driver.get("https://demoqa.com/accordian");
//
//        WebElement firstCard = driver.findElement(By.xpath("//div[@class='card'][1]/div[2]"));
//        String className = firstCard.getAttribute("class");
//        System.out.println(className);
//
//        driver.findElement(By.id("section1Heading")).click();
//
//
//        className = firstCard.getAttribute("class");
//        System.out.println(className);


//      ///////////////////////////// Auto-Complete Part /////////////////////////////

//        driver.get("https://demoqa.com/auto-complete");
//
//        WebElement input = driver.findElement(By.id("autoCompleteSingleInput"));
//
//        input.sendKeys("R");
//
//        List<WebElement> suggestions = driver.findElements(By.cssSelector("div.auto-complete__option"));
//
//        for(WebElement suggestion : suggestions){
//
//            String text = suggestion.getText();
//
//            System.out.println(text);
//
//            if(text.toLowerCase().contains("r"));
//            {
//
//                System.out.println(text + "has r latter.");
//            }
//
//        }


//      ///////////////////////////// Date-Picker Part /////////////////////////////

//        driver.get("https://demoqa.com/date-picker");

//        selectDate("2023","January","13");
//     *********//public void Test2() throws InterruptedException//****** satırının bitiş süslü parantezini buraya alarak date-picker part'ı çalıştırabilirisiniz.


//   private void selectDate(String year, String month, String day){
//        WebElement dateSelection = driver.findElement(By.id("datePickerMonthYearInput"));
//        dateSelection.click();
//
//        WebElement monthElement = driver.findElement(By.className("react-datepicker__month-select"));
//        Select select = new Select(monthElement);
//        select.selectByVisibleText(month);
//
//        WebElement yearElement = driver.findElement(By.className("react-datepicker__year-select"));
//        select = new Select(yearElement);
//        select.selectByVisibleText(year);
//
//        List<WebElement> daysElement =driver.findElements(By.cssSelector("div.react-datepicker__day"));
//
//        for(WebElement dayElement : daysElement){
//
//            String text = dayElement.getText();
//            if(text.equals(day)){
//                dayElement.click();
//                break;
//            }
//
//
//        }
//
//    }

//      ///////////////////////////// Slider Part /////////////////////////////

//        driver.get("https://demoqa.com/slider");

//        WebElement slider = driver.findElement(By.cssSelector("input[type='range']"));
//
//        Actions action = new Actions(driver);
//        action.dragAndDropBy(slider,10,0).perform();
//
//        WebElement valueUnderSlider = driver.findElement(By.cssSelector(".range-slider__tooltip__label"));
//        String value = valueUnderSlider.getText();
//        System.out.println("Recent Value : " + value);
//
//        WebElement sliderValue = driver.findElement(By.id("sliderValue"));
//        String sliderValueText = sliderValue.getAttribute("value");
//        System.out.println("Slider Value : " + sliderValueText);
//
//        Assertions.assertEquals(value,sliderValueText,"Values are not equal!");

//      ///////////////////////////// Progress-Bar Part /////////////////////////////
//        driver.get("https://demoqa.com/progress-bar");
//
//        WebElement startStopButton = driver.findElement(By.id("startStopButton"));
//        startStopButton.click();
//
//        WebElement progressBar = driver.findElement(By.cssSelector("div[role='progressbar']"));
//
//        WebDriverWait wait = new WebDriverWait(driver,50);
//        wait.until(ExpectedConditions.attributeToBe(progressBar, "ariavaluenow","50"));
//        startStopButton.click();

//      ///////////////////////////// Tool-Tip Part /////////////////////////////


//        driver.get("https://demoqa.com/tool-tips");
//
//        WebElement toolTipButton = driver.findElement(By.id("toolTipButton"));
//        Actions action = new Actions(driver);
//        action.moveToElement(toolTipButton).perform();
//
//        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner")));
//
//        WebElement toolTip = driver.findElement(By.className("tooltip-inner"));
//        System.out.println("Text : " + toolTip.getText());
//
//


    }

}
