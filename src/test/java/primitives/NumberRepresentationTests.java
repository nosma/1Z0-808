package primitives;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NumberRepresentationTests {

  int myIntRepresentation;
  int myInt;

  int myDoubleRepresentation;
  int myDouble;

  //  double notAtStart = _1000.00; // DOES NOT COMPILE
  //  double notAtEnd = 1000.00_; // DOES NOT COMPILE
  //  double notByDecimal = 1000_.00; // DOES NOT COMPILE
  //  double notByDecimal = 1000._00; // DOES NOT COMPILE

  @BeforeMethod
  public void setUp() throws Exception {
    myIntRepresentation = 1_000_000;
    myInt = 1000000;
    myDoubleRepresentation = 1_000_000;
    myDouble = 1000000;
  }

  @Test
  public void testEqualityBetweenDifferentIntRerpesentation() throws Exception {
    Assert.assertEquals(myInt, myIntRepresentation);
  }

  @Test
  public void testEqualityBetweenDifferentDoubleRerpesentation() throws Exception {
    Assert.assertEquals(myDouble, myDoubleRepresentation);
  }

}
