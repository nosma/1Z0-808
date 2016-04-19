package oca.classes;

public class $ {

  private final double myDollarDoubleVariable = 10.0;

  public double getMyDollarDoubleVariable() {
    return myDollarDoubleVariable;
  }
}

class Chicken {

  public Chicken() {
    System.out.println("in constructor"); // CONSTRUCTOR
  }

  public void Chicken(){ // NOT A CONSTRUCTOR
    System.out.println("in method");
  }

}