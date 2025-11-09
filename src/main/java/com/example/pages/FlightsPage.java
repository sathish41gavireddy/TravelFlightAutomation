package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage extends BasePage {
    private By sourceInput = By.id("source");
    private By destinationInput = By.id("destination");
    private By dateInput = By.id("date");
    private By searchButton = By.id("search-btn");

    public FlightsPage(WebDriver driver) { super(driver); }
    public void enterFlightDetails(String src, String dest, String date) {
        type(sourceInput, src);
        type(destinationInput, dest);
        type(dateInput, date);
    }
    public void clickSearch() { click(searchButton); }
}
