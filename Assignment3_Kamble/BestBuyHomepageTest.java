import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class BestBuyHomepageTest {

    WebDriver driver;

    @BeforeEach
    void setup() {

        WebDriverManager.chromedriver().setup(); // Setup the ChromeDriver
        driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@AfterEach
void teardown() {

    driver.quit();
}

@Test
void testBestBuyHeaderElementsWithActions() {
    String sutUrl = "https://www.bestbuy.com/";
    driver.get(sutUrl);

    assertThat(driver.getTitle())
    .isEqualTo("Best Buy | Official Online Store | Shop Now & Save");
    assertThat(driver.getCurrentUrl()).isEqualTo(sutUrl);

    // Verify Menu button is displayed and click it
    WebElement menu_button = driver.findElement(By.xpath("//button[@aria-label='Menu']"));
    assertThat(menu_button.isDisplayed()).isTrue();
    menu_button.click();
    sleep(2000);

    // Verify Store button is displayed and click it
    WebElement store_location_button = driver.findElement(By.xpath("//*[@id=\"lt-container\"]/div/div/span/span/button"));
    assertThat(store_location_button.isDisplayed()).isTrue();
    store_location_button.click();
    sleep(2000);

    // Verify Shopping Cart title and click it
    WebElement linkByText = driver.findElement(By.linkText("Cart"));
    assertThat(linkByText.getTagName()).isEqualTo("a");
    assertThat(linkByText.getAttribute("title")).isEqualTo("Cart");
    linkByText.click();
    sleep(2000);

    // Verify Account menu button is displayed and click it
    WebElement account_menu_button = driver.findElement(By.xpath("//*[@id=\"account-menu-account-button\"]/span"));
    assertThat(account_menu_button.isDisplayed()).isTrue();
    account_menu_button.click();
    sleep(2000);

    // Verify Sign In button is displayed using anchor with href and click it
    WebElement sign_in_button = driver.findElement(By.xpath("//a[contains(@href,'/identity/global/signin')]"));
    assertThat(sign_in_button.isDisplayed()).isTrue();
    sign_in_button.click();
    sleep(2000);

    // Your code does not include the search field

    sleep(2000);
}

private void sleep(long milliseconds) {
    try {
        Thread.sleep(milliseconds);
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
}
}