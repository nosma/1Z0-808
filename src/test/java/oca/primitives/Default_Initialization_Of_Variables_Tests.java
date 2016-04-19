package oca.primitives;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Default_Initialization_Of_Variables_Tests {

  private static final double DELTA = 1e-15;

  boolean myBoolean;
  byte myByte;
  short myShort;
  int myInt;
  long myLong;
  float myFloat;
  double myDouble;
  char myChar;

  @Test
  public void testMyBooleanDefaultInitialization() throws Exception {
    assertEquals(false, myBoolean);
  }

  @Test
  public void testMyByteDefaultInitialization() throws Exception {
    assertEquals(0, myByte);
  }

  @Test
  public void testMyShortDefaultInitialization() throws Exception {
    assertEquals(0, myShort);
  }

  @Test
  public void testMyIntDefaultInitialization() throws Exception {
    assertEquals(0, myInt);
  }

  @Test
  public void testMyLongDefaultInitialization() throws Exception {
    assertEquals(0, myLong);
  }

  @Test
  public void testMyFloatDefaultInitialization() throws Exception {
    assertEquals(0.0,myFloat,DELTA);
  }

  @Test
  public void testMyDoubleDefaultInitialization() throws Exception {
    assertEquals(0.0,myDouble);
  }

  @Test
  public void testMyCharDefaultInitialization() throws Exception {
    assertEquals('\u0000',myChar);
  }
}
