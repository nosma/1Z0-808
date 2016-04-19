package oca.primitives;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PrimitivesTests {

  // virtual machine dependent, its "size" isn't something that's precisely defined
  private boolean myBoolean;
  //  8-bit
  private byte myByteUpperLimit = 127;
  private byte myByteLowerLimit = -128;
  // 16-bit
  private short myShortLowerLimit = -32768;
  private short myShortUpperLimit = 32767;
  // 32-bit
  private int myIntLowerLimit = -2147483648;
  private int myIntUpperLimit = 2147483647;
  // 64-bit
  private long myLongLowerLimit = -9223372036854775808L;
  private long myLongUpperLimit = 9223372036854775807L;
  // 32-bit
  private float myFloatLowerLimit = -2.14748365E9f;
  private float myFloatUpperLimit = 2.14748365E9f;
  // 64-bit
  private double myDoubleLowerLimit = -9.223372036854776E18;
  private double myDoubleUpperLimit = 9.223372036854776E18;
  // 16-bit
  private char myCharLowerLimit = '\u0000';
  private char myCharUpperLimit = '\uffff';

  private double my8BitUpperLimit;
  private double my8BitLowerLimit;
  private double my16BitUpperLimit;
  private double my16BitLowerLimit;
  private double my32BitUpperLimit;
  private double my32BitLowerLimit;
  private double my64BitLowerLimit;
  private double my64BitUpperLimit;

  @BeforeMethod
  public void setUp() throws Exception {
    my8BitLowerLimit = getLowerLimit(8.0);
    my8BitUpperLimit = getUpperLimit(8.0);
    my16BitLowerLimit = getLowerLimit(16.0);
    my16BitUpperLimit = getUpperLimit(16.0);
    my32BitLowerLimit = getLowerLimit(32.0);
    my32BitUpperLimit = getUpperLimit(32.0);
    my64BitLowerLimit = getLowerLimit(64.0);
    my64BitUpperLimit = getUpperLimit(64.0);
  }

  private double getLowerLimit(double power) {
    return -(Math.pow(2.0, power) / 2);
  }

  private double getUpperLimit(double power) {
    return (Math.pow(2.0, power) / 2) - 1;
  }

  @Test
  public void testMyByteSizeLimits() throws Exception {
    assertEquals((byte)my8BitUpperLimit, myByteUpperLimit);
    assertEquals((byte)my8BitLowerLimit, myByteLowerLimit);
  }

  @Test
  public void testMyShortSizeLimits() throws Exception {
    assertEquals((short)my16BitLowerLimit, myShortLowerLimit);
    assertEquals((short)my16BitUpperLimit, myShortUpperLimit);
  }

  @Test
  public void testMyIntSizeLimits() throws Exception {
    assertEquals((int)my32BitLowerLimit, myIntLowerLimit);
    assertEquals((int)my32BitUpperLimit, myIntUpperLimit);
  }

  @Test
  public void testMyLongSizeLimits() throws Exception {
    assertEquals((long)my64BitLowerLimit, myLongLowerLimit);
    assertEquals((long)my64BitUpperLimit, myLongUpperLimit);
  }

  @Test
  public void testMyFloatSizeLimits() throws Exception {
    assertEquals((float)my32BitLowerLimit, myFloatLowerLimit);
    assertEquals((float)my32BitUpperLimit, myFloatUpperLimit);
  }

  @Test
  public void testMyDoubleSizeLimits() throws Exception {
    assertEquals(my64BitLowerLimit, myDoubleLowerLimit);
    assertEquals(my64BitUpperLimit, myDoubleUpperLimit);
  }

  @Test
  public void testMyCharSizeLimits() throws Exception {
    assertEquals(Character.MIN_VALUE, myCharLowerLimit);
    assertEquals(Character.MAX_VALUE, myCharUpperLimit);
  }
}
