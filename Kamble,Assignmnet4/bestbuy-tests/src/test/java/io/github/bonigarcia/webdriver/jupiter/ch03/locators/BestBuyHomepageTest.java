package io.github.bonigarcia.webdriver.jupiter.ch03.locators;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

class BestBuyHomepageTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10); // Initialize the wait here
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    private void openHamburgerMenu() {
        WebElement menuButton = driver.findElement(By.xpath("//button[@aria-label='Menu']"));
        assertThat(menuButton.isDisplayed()).isTrue();
        menuButton.click();
    }

    @Test
    void testLevel1DealsMenu() {
        driver.get("https://www.bestbuy.com/");
        openHamburgerMenu();

        WebElement dealsMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Deals']")));
        assertThat(dealsMenu.isDisplayed()).isTrue();
        
        try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        dealsMenu.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
    }

    @Test
    void testLevel1SupportServicesMenu() {
        driver.get("https://www.bestbuy.com/");
        openHamburgerMenu();

        WebElement supportServicesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Support & Services']")));
        assertThat(supportServicesMenu.isDisplayed()).isTrue();
        
        try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        supportServicesMenu.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
    }



@Test
void testTVHometheatre() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement TVMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TV & Home Theater')]")));
    assertThat(TVMenu.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        TVMenu.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void TVBySize() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement TVMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TV & Home Theater')]")));
    assertThat(TVMenu.isDisplayed()).isTrue();
    TVMenu.click();

    WebElement tvbysize = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TVs by Size')]")));
    assertThat(tvbysize.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        tvbysize.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void TopTVDeals() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement TVMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TV & Home Theater')]")));
    assertThat(TVMenu.isDisplayed()).isTrue();
    TVMenu.click();

    WebElement tvbysize = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TVs by Size')]")));
    assertThat(tvbysize.isDisplayed()).isTrue();
    tvbysize.click();

    WebElement toptvdeals = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_tv_sz_toptv']")));
    assertThat(toptvdeals.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        toptvdeals.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void BigTV() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement TVMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TV & Home Theater')]")));
    assertThat(TVMenu.isDisplayed()).isTrue();
    TVMenu.click();

    WebElement tvbysize = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TVs by Size')]")));
    assertThat(tvbysize.isDisplayed()).isTrue();
    tvbysize.click();

    WebElement bigtv = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_tv_sz_75']")));
    assertThat(bigtv.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        bigtv.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void TVByType() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement TVMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TV & Home Theater')]")));
    assertThat(TVMenu.isDisplayed()).isTrue();
    TVMenu.click();

    WebElement tvbytype = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TVs by Type')]")));
    assertThat(tvbytype.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        tvbytype.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void TopTVDeal() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement TVMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TV & Home Theater')]")));
    assertThat(TVMenu.isDisplayed()).isTrue();
    TVMenu.click();

    WebElement tvbytype = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TVs by Type')]")));
    assertThat(tvbytype.isDisplayed()).isTrue();
    tvbytype.click();

    WebElement toptvdeals = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_tv_tp_toptv']")));
    assertThat(toptvdeals.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        toptvdeals.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void TVUnder() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement TVMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TV & Home Theater')]")));
    assertThat(TVMenu.isDisplayed()).isTrue();
    TVMenu.click();

    WebElement tvbytype = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TVs by Type')]")));
    assertThat(tvbytype.isDisplayed()).isTrue();
    tvbytype.click();

    WebElement tvunder = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_tv_tp_u500']")));
    assertThat(tvunder.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        tvunder.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}


@Test
void TVByBrand() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement TVMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TV & Home Theater')]")));
    assertThat(TVMenu.isDisplayed()).isTrue();
    TVMenu.click();

    WebElement tvbybrand = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TVs by Brand')]")));
    assertThat(tvbybrand.isDisplayed()).isTrue();

    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        tvbybrand.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void SamsungTV() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement TVMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TV & Home Theater')]")));
    assertThat(TVMenu.isDisplayed()).isTrue();
    TVMenu.click();

    WebElement tvbybrand = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TVs by Brand')]")));
    assertThat(tvbybrand.isDisplayed()).isTrue();
    tvbybrand.click();

    WebElement samsungtv = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_tv_brand_samsung_tvs']")));
    assertThat(samsungtv.isDisplayed()).isTrue();
  
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        samsungtv.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void LGTV() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement TVMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TV & Home Theater')]")));
    assertThat(TVMenu.isDisplayed()).isTrue();
    TVMenu.click();

    WebElement tvbybrand = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'TVs by Brand')]")));
    assertThat(tvbybrand.isDisplayed()).isTrue();
    tvbybrand.click();

    WebElement lgtv = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_tv_brand_lg_tvs']")));
    assertThat(lgtv.isDisplayed()).isTrue();
  
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        lgtv.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}



  @Test
void testLevel1Appliances() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement appliancesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Appliances')]")));
    assertThat(appliancesMenu.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        appliancesMenu.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void Majorkitchen() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement appliancesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Appliances')]")));
    assertThat(appliancesMenu.isDisplayed()).isTrue();
    appliancesMenu.click();

    WebElement MajorKitchen = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Major Kitchen Appliances')]")));
    assertThat(MajorKitchen.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        MajorKitchen.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}


@Test
void ApplianceSaleEvent() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement appliancesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Appliances')]")));
    assertThat(appliancesMenu.isDisplayed()).isTrue();
    appliancesMenu.click();

    WebElement MajorKitchen = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Major Kitchen Appliances')]")));
    assertThat(MajorKitchen.isDisplayed()).isTrue();
    MajorKitchen.click();

    WebElement applianceSaleEventLink = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_app_mka_sale']")));
    assertThat(applianceSaleEventLink.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        applianceSaleEventLink.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}


@Test
void Dishwashers() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement appliancesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Appliances')]")));
    assertThat(appliancesMenu.isDisplayed()).isTrue();
    appliancesMenu.click();

    WebElement MajorKitchen = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Major Kitchen Appliances')]")));
    assertThat(MajorKitchen.isDisplayed()).isTrue();
    MajorKitchen.click();

    WebElement dishwashersLink = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_app_mka_dis']")));
    assertThat(dishwashersLink.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        dishwashersLink.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}



@Test
void Luxurykitchen() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement appliancesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Appliances')]")));
    assertThat(appliancesMenu.isDisplayed()).isTrue();
    appliancesMenu.click();

    WebElement luxuryKitchen = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Luxury Kitchen Appliances')]")));
    assertThat(luxuryKitchen.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        luxuryKitchen.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void LuxuryAppliancePromotion() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement appliancesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Appliances')]")));
    assertThat(appliancesMenu.isDisplayed()).isTrue();
    appliancesMenu.click();

    WebElement luxuryKitchen = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Luxury Kitchen Appliances')]")));
    assertThat(luxuryKitchen.isDisplayed()).isTrue();
    luxuryKitchen.click();

    WebElement luxuryappliancepromotion = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_app_lux_app_promo']")));
    assertThat(luxuryappliancepromotion.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        luxuryappliancepromotion.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void LuxuryRanges() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement appliancesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Appliances')]")));
    assertThat(appliancesMenu.isDisplayed()).isTrue();
    appliancesMenu.click();

    WebElement luxuryKitchen = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Luxury Kitchen Appliances')]")));
    assertThat(luxuryKitchen.isDisplayed()).isTrue();
    luxuryKitchen.click();

    WebElement luxuryranges = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_app_lux_rang']")));
    assertThat(luxuryranges.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        luxuryranges.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}


@Test
void VacuumFloorCare() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement appliancesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
    By.xpath("//button[contains(text(), 'Appliances')]")));
    assertThat(appliancesMenu.isDisplayed()).isTrue();
    appliancesMenu.click();

    WebElement VacuumsFloorCareMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Vacuums & Floor Care')]")));
    assertThat(VacuumsFloorCareMenu.isDisplayed()).isTrue();
    VacuumsFloorCareMenu.click();

    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        VacuumsFloorCareMenu.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void VacuumsFloorCareDeals() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement appliancesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
    By.xpath("//button[contains(text(), 'Appliances')]")));
    assertThat(appliancesMenu.isDisplayed()).isTrue();
    appliancesMenu.click();

    WebElement VacuumsFloorCareMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Vacuums & Floor Care')]")));
    assertThat(VacuumsFloorCareMenu.isDisplayed()).isTrue();
    VacuumsFloorCareMenu.click();

    WebElement vacuumfloorcareLink = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_app_vau_td_vfcd']")));
    assertThat(vacuumfloorcareLink.isDisplayed()).isTrue();

    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        vacuumfloorcareLink.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void UprightVacuum() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement appliancesMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
    By.xpath("//button[contains(text(), 'Appliances')]")));
    assertThat(appliancesMenu.isDisplayed()).isTrue();
    appliancesMenu.click();

    WebElement VacuumsFloorCareMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Vacuums & Floor Care')]")));
    assertThat(VacuumsFloorCareMenu.isDisplayed()).isTrue();
    VacuumsFloorCareMenu.click();

    WebElement uprightvacuumLink = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_app_vau_up']")));
    assertThat(uprightvacuumLink.isDisplayed()).isTrue();

    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        uprightvacuumLink.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}


 @Test
void testLevel1ComputerTablet() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    // WebElement brandsMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Brands']")));
    WebElement computertablet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Computers & Tablets']")));
    assertThat(computertablet.isDisplayed()).isTrue();
    // brandsMenu.click();
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        computertablet.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
        } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
        }
    }

@Test
void LaptopDesktop() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement computertablet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Computers & Tablets']")));
    assertThat(computertablet.isDisplayed()).isTrue();
    computertablet.click();

    WebElement laptopdesktop = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Laptops & Desktops')]")));
        laptopdesktop.click();

    assertThat(laptopdesktop.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        laptopdesktop.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void GamingDesktops() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement computertablet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Computers & Tablets']")));
    assertThat(computertablet.isDisplayed()).isTrue();
    computertablet.click();

    WebElement laptopdesktop = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Laptops & Desktops')]")));
        assertThat(laptopdesktop.isDisplayed()).isTrue();
        laptopdesktop.click();

    WebElement gamingdesktopLink = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_cp_ld_gaming_desktops']")));
    assertThat(gamingdesktopLink.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        gamingdesktopLink.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}


@Test
void Laptops() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement computertablet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Computers & Tablets']")));
    assertThat(computertablet.isDisplayed()).isTrue();
    computertablet.click();

    WebElement laptopdesktop = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Laptops & Desktops')]")));
        assertThat(laptopdesktop.isDisplayed()).isTrue();
        laptopdesktop.click();

    WebElement laptopsLink = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_cp_ld_lnb']")));
    assertThat(laptopsLink.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        laptopsLink.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}





@Test
void Monitors() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement computertablet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Computers & Tablets']")));
    assertThat(computertablet.isDisplayed()).isTrue();
    computertablet.click();

    WebElement monitors = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Monitors')]")));
        monitors.click();

    assertThat(monitors.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        monitors.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void KMonitors() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement computertablet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Computers & Tablets']")));
    assertThat(computertablet.isDisplayed()).isTrue();
    computertablet.click();

    WebElement monitors = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Monitors')]")));
        assertThat(monitors.isDisplayed()).isTrue();
        monitors.click();

    WebElement kmonitors = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_cp_mon_4kmon']")));
        assertThat(kmonitors.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        kmonitors.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void UltrawideMonitors() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement computertablet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Computers & Tablets']")));
    assertThat(computertablet.isDisplayed()).isTrue();
    computertablet.click();

    WebElement monitors = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Monitors')]")));
        assertThat(monitors.isDisplayed()).isTrue();
        monitors.click();

    WebElement ultrawidemonitors = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_cp_mon_ultrawide_monitors']")));
        assertThat(ultrawidemonitors.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        ultrawidemonitors.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}






@Test
void ComputerComponents() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement computertablet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Computers & Tablets']")));
    assertThat(computertablet.isDisplayed()).isTrue();
    computertablet.click();

    WebElement computercomponents = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//button[contains(text(), 'Computer Components')]")));
        computercomponents.click();

    assertThat(computercomponents.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        computercomponents.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void VideoGraphicCard() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement computertablet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Computers & Tablets']")));
    assertThat(computertablet.isDisplayed()).isTrue();
    computertablet.click();

    WebElement monitors = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'Computer Components')]")));
    assertThat(monitors.isDisplayed()).isTrue();   
    monitors.click();

    WebElement videographiccard = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_cp_coco_vgc']")));
        assertThat(videographiccard.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        videographiccard.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void CpuProcessor() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();


    WebElement computertablet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Computers & Tablets']")));
    assertThat(computertablet.isDisplayed()).isTrue();
    computertablet.click();

    WebElement monitors = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'Computer Components')]")));
    assertThat(monitors.isDisplayed()).isTrue();   
    monitors.click();

    WebElement cpuprocessor = wait.until(ExpectedConditions.elementToBeClickable(
        By.cssSelector("a[data-lid='ubr_cp_coco_cpu']")));
        assertThat(cpuprocessor.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        cpuprocessor.click();
        // Wait for a few seconds after clicking, to see the result
        Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
        // Handle the exception
        Thread.currentThread().interrupt(); // set the interrupt flag
        System.out.println("Thread was interrupted, Failed to complete operation");
    }
}


@Test
void testLevel1CellPhones() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement cellphones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Cell Phones']")));
    assertThat(cellphones.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        cellphones.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void PrepaidPhoneandPlans() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement cellphones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Cell Phones']")));
    assertThat(cellphones.isDisplayed()).isTrue();
    cellphones.click();

    WebElement prepaidphonenandplans = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Prepaid Phones & Plans']")));
    assertThat(prepaidphonenandplans.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        prepaidphonenandplans.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void PrepaidCellPhones() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement cellphones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Cell Phones']")));
    assertThat(cellphones.isDisplayed()).isTrue();
    cellphones.click();

    WebElement prepaidphonenandplans = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Prepaid Phones & Plans']")));
    assertThat(prepaidphonenandplans.isDisplayed()).isTrue();
    prepaidphonenandplans.click();

    WebElement prepaidcellphones = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_mob_prepaid_prepaid_cell_phones']")));
    assertThat(prepaidcellphones.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        prepaidcellphones.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void PrepaidPhoneCards() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement cellphones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Cell Phones']")));
    assertThat(cellphones.isDisplayed()).isTrue();
    cellphones.click();

    WebElement prepaidphonenandplans = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Prepaid Phones & Plans']")));
    assertThat(prepaidphonenandplans.isDisplayed()).isTrue();
    prepaidphonenandplans.click();

    WebElement prepaidphonecards = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_mob_prepaid_prepaid_phone_cards']")));
    assertThat(prepaidphonecards.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        prepaidphonecards.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}




@Test
void iPhone() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement cellphones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Cell Phones']")));
    assertThat(cellphones.isDisplayed()).isTrue();
    cellphones.click();

    WebElement iphone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='iPhone']")));
    assertThat(iphone.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        iphone.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void iPhoneNewPro() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement cellphones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Cell Phones']")));
    assertThat(cellphones.isDisplayed()).isTrue();
    cellphones.click();

    WebElement iphone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='iPhone']")));
    assertThat(iphone.isDisplayed()).isTrue();
    iphone.click();

    WebElement iphonenewpro = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_mob_ip_iphone_15_pro']")));
    assertThat(iphonenewpro.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        iphonenewpro.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void iPhoneNew() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement cellphones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Cell Phones']")));
    assertThat(cellphones.isDisplayed()).isTrue();
    cellphones.click();

    WebElement iphone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='iPhone']")));
    assertThat(iphone.isDisplayed()).isTrue();
    iphone.click();

    WebElement iphonenew = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_mob_ip_iphone_15']")));
    assertThat(iphonenew.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        iphonenew.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void iPhoneOldPro() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement cellphones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Cell Phones']")));
    assertThat(cellphones.isDisplayed()).isTrue();
    cellphones.click();

    WebElement iphone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='iPhone']")));
    assertThat(iphone.isDisplayed()).isTrue();
    iphone.click();

    WebElement iphoneoldpro = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_mob_ip_iphone_14_pro']")));
    assertThat(iphoneoldpro.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        iphoneoldpro.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}


@Test
void SamsungGalaxy() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement cellphones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Cell Phones']")));
    assertThat(cellphones.isDisplayed()).isTrue();
    cellphones.click();

    WebElement samsunggalaxy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Samsung Galaxy']")));
    assertThat(samsunggalaxy.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        samsunggalaxy.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}
 
@Test
void GalaxyS23FE() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement cellphones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Cell Phones']")));
    assertThat(cellphones.isDisplayed()).isTrue();
    cellphones.click();

    WebElement samsunggalaxy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Samsung Galaxy']")));
    assertThat(samsunggalaxy.isDisplayed()).isTrue();
    samsunggalaxy.click();

    WebElement galaxyfe = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_mob_sg_s23fe']")));
    assertThat(galaxyfe.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        galaxyfe.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void GalaxyS23() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement cellphones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Cell Phones']")));
    assertThat(cellphones.isDisplayed()).isTrue();
    cellphones.click();

    WebElement samsunggalaxy = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Samsung Galaxy']")));
    assertThat(samsunggalaxy.isDisplayed()).isTrue();
    samsunggalaxy.click();

    WebElement galaxy = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_mob_sg_samsung_galaxy_s23']")));
    assertThat(galaxy.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        galaxy.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

    @Test
    void testLevel1AudioMenu() {
        driver.get("https://www.bestbuy.com/");
        openHamburgerMenu();

        WebElement AudioMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Audio']")));
        assertThat(AudioMenu.isDisplayed()).isTrue();
        try {
            // Wait for a few seconds before clicking the button
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
            AudioMenu.click();
            // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
        } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
        }
    }

    @Test
    void HomeAudio() {
        driver.get("https://www.bestbuy.com/");
        openHamburgerMenu();
    
        WebElement AudioMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Audio']")));
        assertThat(AudioMenu.isDisplayed()).isTrue();
        AudioMenu.click();
    
        WebElement homeaudio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Home Audio']")));
        assertThat(homeaudio.isDisplayed()).isTrue();
        
        try {
            // Wait for a few seconds before clicking the button
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
            homeaudio.click();
            // Wait for a few seconds after clicking, to see the result
                Thread.sleep(3000); // Keep the browser open for 3 more seconds
        } catch (InterruptedException e) {
                // Handle the exception
                Thread.currentThread().interrupt(); // set the interrupt flag
                System.out.println("Thread was interrupted, Failed to complete operation");
        }
    }

    @Test
void Speakers() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement AudioMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Audio']")));
    assertThat(AudioMenu.isDisplayed()).isTrue();
    AudioMenu.click();
    
    WebElement homeaudio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Home Audio']")));
    assertThat(homeaudio.isDisplayed()).isTrue();
    homeaudio.click();

    WebElement speakers = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_au_ha_spk']")));
    assertThat(speakers.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        speakers.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
void SoundBars() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement AudioMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Audio']")));
    assertThat(AudioMenu.isDisplayed()).isTrue();
    AudioMenu.click();
    
    WebElement homeaudio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Home Audio']")));
    assertThat(homeaudio.isDisplayed()).isTrue();
    homeaudio.click();

    WebElement soundbars = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_au_ha_sb']")));
    assertThat(soundbars.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        soundbars.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

    @Test
    void Headphones() {
        driver.get("https://www.bestbuy.com/");
        openHamburgerMenu();
    
        WebElement AudioMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Audio']")));
        assertThat(AudioMenu.isDisplayed()).isTrue();
        AudioMenu.click();
    
        WebElement headphones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Headphones']")));
        assertThat(headphones.isDisplayed()).isTrue();
        
        try {
            // Wait for a few seconds before clicking the button
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
            headphones.click();
            // Wait for a few seconds after clicking, to see the result
                Thread.sleep(3000); // Keep the browser open for 3 more seconds
        } catch (InterruptedException e) {
                // Handle the exception
                Thread.currentThread().interrupt(); // set the interrupt flag
                System.out.println("Thread was interrupted, Failed to complete operation");
        }
    }

    @Test
    void Airpods() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement AudioMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Audio']")));
    assertThat(AudioMenu.isDisplayed()).isTrue();
    AudioMenu.click();
    
    WebElement headphones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Headphones']")));
    assertThat(headphones.isDisplayed()).isTrue();
    headphones.click();

    WebElement airpods = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_au_hed_airpod']")));
    assertThat(airpods.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        airpods.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}

@Test
    void WirelessHeadphones() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();

    WebElement AudioMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Audio']")));
    assertThat(AudioMenu.isDisplayed()).isTrue();
    AudioMenu.click();
    
    WebElement headphones = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Headphones']")));
    assertThat(headphones.isDisplayed()).isTrue();
    headphones.click();

    WebElement wirelessheadphones = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_au_hed_wless']")));
    assertThat(wirelessheadphones.isDisplayed()).isTrue();
    
    try {
        // Wait for a few seconds before clicking the button
        Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        wirelessheadphones.click();
        // Wait for a few seconds after clicking, to see the result
            Thread.sleep(3000); // Keep the browser open for 3 more seconds
    } catch (InterruptedException e) {
            // Handle the exception
            Thread.currentThread().interrupt(); // set the interrupt flag
            System.out.println("Thread was interrupted, Failed to complete operation");
    }
}



    @Test
    void BluetoothSpeakers() {
        driver.get("https://www.bestbuy.com/");
        openHamburgerMenu();
    
        WebElement AudioMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Audio']")));
        assertThat(AudioMenu.isDisplayed()).isTrue();
        AudioMenu.click();
    
        WebElement bluetoothspeakers = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Bluetooth Speakers']")));
        assertThat(bluetoothspeakers.isDisplayed()).isTrue();
        
        try {
            // Wait for a few seconds before clicking the button
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
            bluetoothspeakers.click();
            // Wait for a few seconds after clicking, to see the result
                Thread.sleep(3000); // Keep the browser open for 3 more seconds
        } catch (InterruptedException e) {
                // Handle the exception
                Thread.currentThread().interrupt(); // set the interrupt flag
                System.out.println("Thread was interrupted, Failed to complete operation");
        }
    }

    @Test
    void PortableSpeakers() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();
    
    WebElement AudioMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Audio']")));
    assertThat(AudioMenu.isDisplayed()).isTrue();
    AudioMenu.click();
        
    WebElement bluetoothspeakers = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Bluetooth Speakers']")));
    assertThat(bluetoothspeakers.isDisplayed()).isTrue();
    bluetoothspeakers.click();
    
    WebElement portablespeakers = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_au_bt_ps']")));
    assertThat(portablespeakers.isDisplayed()).isTrue();
        
    try {
            // Wait for a few seconds before clicking the button
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
            portablespeakers.click();
            // Wait for a few seconds after clicking, to see the result
                Thread.sleep(3000); // Keep the browser open for 3 more seconds
        } catch (InterruptedException e) {
                // Handle the exception
                Thread.currentThread().interrupt(); // set the interrupt flag
                System.out.println("Thread was interrupted, Failed to complete operation");
        }
    }  

    @Test
    void SmartSpeakers() {
    driver.get("https://www.bestbuy.com/");
    openHamburgerMenu();
    
    WebElement AudioMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Audio']")));
    assertThat(AudioMenu.isDisplayed()).isTrue();
    AudioMenu.click();
        
    WebElement bluetoothspeakers = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Bluetooth Speakers']")));
    assertThat(bluetoothspeakers.isDisplayed()).isTrue();
    bluetoothspeakers.click();
    
    WebElement smartspeakers = wait.until(ExpectedConditions.elementToBeClickable(
    By.cssSelector("a[data-lid='ubr_au_bt_smspk']")));
    assertThat(smartspeakers.isDisplayed()).isTrue();
        
    try {
            // Wait for a few seconds before clicking the button
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
            smartspeakers.click();
            // Wait for a few seconds after clicking, to see the result
                Thread.sleep(3000); // Keep the browser open for 3 more seconds
        } catch (InterruptedException e) {
                // Handle the exception
                Thread.currentThread().interrupt(); // set the interrupt flag
                System.out.println("Thread was interrupted, Failed to complete operation");
        }
    }  

}