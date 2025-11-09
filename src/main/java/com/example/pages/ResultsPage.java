package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ResultsPage extends BasePage {
    private By flightRows = By.cssSelector(".flight-row");
    public ResultsPage(WebDriver driver) { super(driver); }

    public void printCheapestFlights() {
        List<WebElement> rows = driver.findElements(flightRows);
        rows.sort((a, b) -> {
            int priceA = Integer.parseInt(a.getAttribute("data-price"));
            int priceB = Integer.parseInt(b.getAttribute("data-price"));
            return Integer.compare(priceA, priceB);
        });
        if (rows.size() >= 2) {
            System.out.println("Cheapest flight: " + rows.get(0).getText());
            System.out.println("Second cheapest flight: " + rows.get(1).getText());
        }
    }
}
