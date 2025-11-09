package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By flightsTab = By.id("flights-tab");
    public HomePage(WebDriver driver) { super(driver); }
    public void goToFlightsSection() { click(flightsTab); }
}
