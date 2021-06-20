package es.uma.informatica.sii.jsf.demo;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DefaultSuiteIT {
	
	private final static String BASE_URL="http://localhost:8080/jsf.demo/";
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void apellidopresenteentabla() {
    // Test name: Apellido presente en tabla
    // Step # | name | target | value
    // 1 | open | /jsf.demo-0.0.1-SNAPSHOT/faces/agenda.xhtml | 
    driver.get(BASE_URL+"faces/agenda.xhtml");
    // 2 | assertText | css=#accionesContactos\3Atabla th:nth-child(2) | Apellido
    assertThat(driver.findElement(By.cssSelector("#accionesContactos\\3Atabla th:nth-child(2)")).getText(), is("Apellido"));
    // 3 | close |  | 
    driver.close();
  }
  @Test
  public void apellidopresenteentrada() {
    // Test name: Apellido presente entrada
    // Step # | name | target | value
    // 1 | open | /jsf.demo-0.0.1-SNAPSHOT/faces/agenda.xhtml | 
    driver.get(BASE_URL+"faces/agenda.xhtml");
    // 2 | assertText | css=#entradaContactos th:nth-child(2) | Apellido
    assertThat(driver.findElement(By.cssSelector("#entradaContactos th:nth-child(2)")).getText(), is("Apellido"));
    // 3 | close |  | 
    driver.close();
  }
  @Test
  public void aadedosusuariosentabla() {
    // Test name: Añade dos usuarios en tabla
    // Step # | name | target | value
    // 1 | open | /jsf.demo-0.0.1-SNAPSHOT/faces/agenda.xhtml | 
    driver.get(BASE_URL+"faces/agenda.xhtml");
    // 2 | type | id=entradaContactos:nombre | Antonio
    driver.findElement(By.id("entradaContactos:nombre")).sendKeys("Antonio");
    // 3 | type | xpath=//form[@id='entradaContactos']/table/tbody/tr/td[2]/input | Ramos
    driver.findElement(By.xpath("//form[@id=\'entradaContactos\']/table/tbody/tr/td[2]/input")).sendKeys("Ramos");
    // 4 | type | id=entradaContactos:telefono | 123
    driver.findElement(By.id("entradaContactos:telefono")).sendKeys("123");
    // 5 | click | id=entradaContactos:botonAniadir | 
    driver.findElement(By.id("entradaContactos:botonAniadir")).click();
    // 6 | type | id=entradaContactos:nombre | Manuel
    driver.findElement(By.id("entradaContactos:nombre")).sendKeys("Manuel");
    // 7 | type | xpath=//form[@id='entradaContactos']/table/tbody/tr/td[2]/input | Infante
    driver.findElement(By.xpath("//form[@id=\'entradaContactos\']/table/tbody/tr/td[2]/input")).sendKeys("Infante");
    // 8 | type | id=entradaContactos:telefono | 456
    driver.findElement(By.id("entradaContactos:telefono")).sendKeys("456");
    // 9 | click | id=entradaContactos:botonAniadir | 
    driver.findElement(By.id("entradaContactos:botonAniadir")).click();
    // 10 | assertText | xpath=//table[@id='accionesContactos:tabla']/tbody/tr/td[2]/span | Ramos
    assertThat(driver.findElement(By.xpath("//table[@id=\'accionesContactos:tabla\']/tbody/tr/td[2]/span")).getText(), is("Ramos"));
    // 11 | assertText | xpath=//table[@id='accionesContactos:tabla']/tbody/tr[2]/td[2]/span | Infante
    assertThat(driver.findElement(By.xpath("//table[@id=\'accionesContactos:tabla\']/tbody/tr[2]/td[2]/span")).getText(), is("Infante"));
    // 12 | assertText | id=accionesContactos:tabla:1:nombre | Manuel
    assertThat(driver.findElement(By.id("accionesContactos:tabla:1:nombre")).getText(), is("Manuel"));
    // 13 | assertText | id=accionesContactos:tabla:0:nombre | Antonio
    assertThat(driver.findElement(By.id("accionesContactos:tabla:0:nombre")).getText(), is("Antonio"));
    // 14 | click | id=accionesContactos:tabla:0:eliminar | 
    driver.findElement(By.id("accionesContactos:tabla:0:eliminar")).click();
    // 15 | click | id=accionesContactos:tabla:0:eliminar | 
    driver.findElement(By.id("accionesContactos:tabla:0:eliminar")).click();
    // 16 | close |  | 
    driver.close();
  }
  @Test
  public void eliminaunusuario() {
    // Test name: Elimina un usuario
    // Step # | name | target | value
    // 1 | open | /jsf.demo-0.0.1-SNAPSHOT/faces/agenda.xhtml | 
    driver.get(BASE_URL+"faces/agenda.xhtml");
    // 2 | type | id=entradaContactos:nombre | Antonio
    driver.findElement(By.id("entradaContactos:nombre")).sendKeys("Antonio");
    // 3 | type | xpath=//form[@id='entradaContactos']/table/tbody/tr/td[2]/input | Ramos
    driver.findElement(By.xpath("//form[@id=\'entradaContactos\']/table/tbody/tr/td[2]/input")).sendKeys("Ramos");
    // 4 | type | id=entradaContactos:telefono | 123
    driver.findElement(By.id("entradaContactos:telefono")).sendKeys("123");
    // 5 | click | id=entradaContactos:botonAniadir | 
    driver.findElement(By.id("entradaContactos:botonAniadir")).click();
    // 6 | assertText | xpath=//table[@id='accionesContactos:tabla']/tbody/tr/td[2]/span | Ramos
    assertThat(driver.findElement(By.xpath("//table[@id=\'accionesContactos:tabla\']/tbody/tr/td[2]/span")).getText(), is("Ramos"));
    // 7 | click | id=accionesContactos:tabla:0:eliminar | 
    driver.findElement(By.id("accionesContactos:tabla:0:eliminar")).click();
    // 8 | assertElementNotPresent | xpath=//table[@id='accionesContactos:tabla']/tbody/tr/td[2]/span | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//table[@id=\'accionesContactos:tabla\']/tbody/tr/td[2]/span"));
      assert(elements.size() == 0);
    }
    // 9 | close |  | 
    driver.close();
  }
  @Test
  public void insertaapellidoencombo() {
    // Test name: Inserta apellido en combo
    // Step # | name | target | value
    // 1 | open | /jsf.demo-0.0.1-SNAPSHOT/faces/agenda.xhtml | 
    driver.get(BASE_URL+"faces/agenda.xhtml");
    // 2 | type | id=entradaContactos:nombre | Antonio
    driver.findElement(By.id("entradaContactos:nombre")).sendKeys("Antonio");
    // 3 | type | xpath=//form[@id='entradaContactos']/table/tbody/tr/td[2]/input | Ramos
    driver.findElement(By.xpath("//form[@id=\'entradaContactos\']/table/tbody/tr/td[2]/input")).sendKeys("Ramos");
    // 4 | type | id=entradaContactos:telefono | 123
    driver.findElement(By.id("entradaContactos:telefono")).sendKeys("123");
    // 5 | click | id=entradaContactos:botonAniadir | 
    driver.findElement(By.id("entradaContactos:botonAniadir")).click();
    // 6 | assertText | id=selector:menuSeleccion |  Antonio Ramos
    assertThat(driver.findElement(By.id("selector:menuSeleccion")).getText(), is(" Antonio Ramos"));
    // 7 | click | id=accionesContactos:tabla:0:eliminar | 
    driver.findElement(By.id("accionesContactos:tabla:0:eliminar")).click();
    // 8 | close |  | 
    driver.close();
  }
  @Test
  public void insertaapellidoentabla() {
    // Test name: Inserta apellido en tabla
    // Step # | name | target | value
    // 1 | open | /jsf.demo-0.0.1-SNAPSHOT/faces/agenda.xhtml | 
    driver.get(BASE_URL+"faces/agenda.xhtml");
    // 2 | type | id=entradaContactos:nombre | Antonio
    driver.findElement(By.id("entradaContactos:nombre")).sendKeys("Antonio");
    // 3 | type | xpath=//form[@id='entradaContactos']/table/tbody/tr/td[2]/input | Ramos
    driver.findElement(By.xpath("//form[@id=\'entradaContactos\']/table/tbody/tr/td[2]/input")).sendKeys("Ramos");
    // 4 | type | id=entradaContactos:telefono | 123
    driver.findElement(By.id("entradaContactos:telefono")).sendKeys("123");
    // 5 | click | id=entradaContactos:botonAniadir | 
    driver.findElement(By.id("entradaContactos:botonAniadir")).click();
    // 6 | assertText | xpath=//table[@id='accionesContactos:tabla']/tbody/tr/td[2]/span | Ramos
    assertThat(driver.findElement(By.xpath("//table[@id=\'accionesContactos:tabla\']/tbody/tr/td[2]/span")).getText(), is("Ramos"));
    // 7 | click | id=accionesContactos:tabla:0:eliminar | 
    driver.findElement(By.id("accionesContactos:tabla:0:eliminar")).click();
    // 8 | close |  | 
    driver.close();
  }
  @Test
  public void seleccionausuarioenmenu() {
    // Test name: Selecciona usuario en menu
    // Step # | name | target | value
    // 1 | open | /jsf.demo-0.0.1-SNAPSHOT/faces/agenda.xhtml | 
    driver.get(BASE_URL+"faces/agenda.xhtml");
    // 2 | type | id=entradaContactos:nombre | Antonio
    driver.findElement(By.id("entradaContactos:nombre")).sendKeys("Antonio");
    // 3 | type | xpath=//form[@id='entradaContactos']/table/tbody/tr/td[2]/input | Ramos
    driver.findElement(By.xpath("//form[@id=\'entradaContactos\']/table/tbody/tr/td[2]/input")).sendKeys("Ramos");
    // 4 | type | id=entradaContactos:telefono | 123
    driver.findElement(By.id("entradaContactos:telefono")).sendKeys("123");
    // 5 | click | id=entradaContactos:botonAniadir | 
    driver.findElement(By.id("entradaContactos:botonAniadir")).click();
    // 6 | click | id=selector:botonContactoElegido | 
    driver.findElement(By.id("selector:botonContactoElegido")).click();
    // 7 | assertText | id=selector:textoContactoElegido | Ramos
    assertThat(driver.findElement(By.id("selector:textoContactoElegido")).getText(), is("Ramos"));
    // 8 | click | id=accionesContactos:tabla:0:eliminar | 
    driver.findElement(By.id("accionesContactos:tabla:0:eliminar")).click();
    // 9 | close |  | 
    driver.close();
  }
  @Test
  public void trescamposdeentrada() {
    // Test name: Tres campos de entrada
    // Step # | name | target | value
    // 1 | open | /jsf.demo-0.0.1-SNAPSHOT/faces/agenda.xhtml | 
    driver.get(BASE_URL+"faces/agenda.xhtml");
    // 2 | assertElementPresent | xpath=//form[@id='entradaContactos']/table/tbody/tr/td[1]/input | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//form[@id=\'entradaContactos\']/table/tbody/tr/td[1]/input"));
      assert(elements.size() > 0);
    }
    // 3 | assertElementPresent | xpath=//form[@id='entradaContactos']/table/tbody/tr/td[2]/input | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//form[@id=\'entradaContactos\']/table/tbody/tr/td[2]/input"));
      assert(elements.size() > 0);
    }
    // 4 | assertElementPresent | xpath=//form[@id='entradaContactos']/table/tbody/tr/td[3]/input | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//form[@id=\'entradaContactos\']/table/tbody/tr/td[3]/input"));
      assert(elements.size() > 0);
    }
    // 5 | assertElementPresent | xpath=//form[@id='entradaContactos']/table/tbody/tr/td[4]/input | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//form[@id=\'entradaContactos\']/table/tbody/tr/td[4]/input"));
      assert(elements.size() > 0);
    }
    // 6 | close |  | 
    driver.close();
  }
}
