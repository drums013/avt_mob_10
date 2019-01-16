import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainClassTest {

  MainClass mainClass = new MainClass();

  @Test
  public void testGetLocalNumber() {
    int expected = 14;
    int actual = mainClass.getLocalNumber();
    assertEquals("Expected 14, but found " + actual, expected, actual);
  }

  @Test
  public void testGetClassNumber() {
    int expected = 45;
    int actual = mainClass.getClassNumber();
    assertTrue(actual + " less than or equal " + expected,actual > expected);
  }

  @Test
  public void testGetClassString() {
    String expected = "hello";
    String actual = mainClass.getClassString().toLowerCase();
    assertTrue("String does not contains \"" + expected + "\"", actual.contains(expected));
  }
}
