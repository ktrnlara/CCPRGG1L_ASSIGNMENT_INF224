package integration;

import org.junit.Test;
import portfolio.abigail.AbiPortfolio;
import portfolio.charles.HomePage;
import portfolio.kat.MyPortfolio;

public class IntegrationTest {

    @Test
    public void testPortfolioIntegration() {
        PortfolioIntegration wonderPets = new PortfolioIntegration();
        wonderPets.portfolioIntegrationRun();
    }

    @Test
    public void testAbiPortfolio() {
        AbiPortfolio abi = new AbiPortfolio();
        abi.abiPortfolioRun();
    }

    @Test
    public void testHomePage() {
        HomePage charles = new HomePage();
        charles.charlesPortfolioRun();
    }

    @Test
    public void testMyPortfolio() {
        MyPortfolio kat = new MyPortfolio();
        kat.katPortfolioRun();
    }
}
