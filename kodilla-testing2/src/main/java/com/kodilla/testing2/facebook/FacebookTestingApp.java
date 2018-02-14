package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_MONTH = "//span[contains(@class, \"_5k_4\")]/span/select[1]";
    public static final String XPATH_SELECT_DAY = "//span[contains(@class, \"_5k_4\")]/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//span[contains(@class, \"_5k_4\")]/span/select[3]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);

        driver.get("https://web.facebook.com/?_rdc=1&_rdr");


        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectCombo);
        selectMonth.selectByIndex(2);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectCombo2);
        selectDay.selectByIndex(4);

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectCombo3);
        selectYear.selectByIndex(35);
    }
}
