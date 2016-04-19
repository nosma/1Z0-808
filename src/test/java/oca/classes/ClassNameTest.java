package oca.classes;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ClassNameTest {

  $ myDollarNamedClass;
  _MyUnderscoreClass myUnderscoreClass;

  //  3DPointClass // identifiers cannot begin with a number
  //  hollywood@vine // @ is not a letter, digit, $ or _
  //  *$coffee // * is not a letter, digit, $ or _
  //  public // public is a reserved word

  @BeforeMethod
  public void setUp() throws Exception {
    myDollarNamedClass = new $();
    myUnderscoreClass = new _MyUnderscoreClass();
  }

  @Test
  public void testDollarNamedClass() throws Exception {
    assertTrue(myDollarNamedClass instanceof $);
  }

  @Test
  public void testMethodThatStartWithCapitalLetter() throws Exception {
    Chicken chick = new Chicken();
    chick.Chicken();
  }

  @Test
  public void testClassNameThatStartsWithUnderscore() throws Exception {
    assertTrue(myUnderscoreClass instanceof _MyUnderscoreClass);
  }

  @Test
  public void testIdentifierNameThatStartsWithUnderscore() throws Exception {
    assertEquals(10.0, myUnderscoreClass.get_myUnderscoreDoubleVariable());
  }

  @Test
  public void testIdentifierNameThatStartsWithDollar() throws Exception {
    assertEquals(10.0, myDollarNamedClass.getMyDollarDoubleVariable());
  }

}
