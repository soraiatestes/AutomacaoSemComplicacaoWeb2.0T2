package br.com.chronosacademy.automacaoWeb;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class TestWeb {
    ChromeDriver driver;
    @Before
    public void inicializaTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");
    }
    @Test
    public void primeiroTeste(){

        String xpathTitulo = "//section[2]//h4";
    //                       "//html/body/div/div/div/section[2]/div[3]/div/div/div[1]/div/h4";
    //                       "//section[2]/div[3]/div/div/div[1]/div//h4";

        WebElement txtTitulo= driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.", titulo);
    }
    @After
    public void finalizaTest(){
        driver.quit();
    }
}
