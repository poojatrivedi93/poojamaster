package generic;

import org.testng.annotations.Test;

public class ReadDataFromCommandPromptTest {
@Test
public void cmdline() {
	String username = System.getProperty("username");
	String password = System.getProperty("password");
	String url = System.getProperty("url");
  String browser = System.getProperty("browser");
  System.out.println(username);
  System.out.println(password);
  System.out.println(url);
  System.out.println(browser);}
  @Test
  public void m2() {
	  System.out.println("m2 method is running");
	  
  
}
}
