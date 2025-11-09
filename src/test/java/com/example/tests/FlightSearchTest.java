package com.example.tests;

import com.example.pages.FlightsPage;
import com.example.pages.HomePage;
import com.example.pages.ResultsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class FlightSearchTest extends BaseTest {
    @Test
    public void testFlightSearchFlow() {
        HomePage home = new HomePage(driver);
        home.goToFlightsSection();

        FlightsPage flights = new FlightsPage(driver);
        flights.enterFlightDetails("Delhi", "Mumbai", "2025-12-20");
        flights.clickSearch();

        ResultsPage results = new ResultsPage(driver);
        results.printCheapestFlights();

        ((JavascriptExecutor) driver).executeScript("window.open('https://www.google.com','_blank');");
    }
}
