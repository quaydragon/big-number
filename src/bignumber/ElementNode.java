package bignumber;

public class ElementNode implements BigNumber {
  private int number;
  private BigNumber rest;
  
  
  public ElementNode(int number, BigNumber bigNumber) {
    this.number = number;
    this.rest = bigNumber;
    
  }

  @Override
  public int compareTo(BigNumber o) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int length() {
    // TODO Auto-generated method stub
    return 0;
  }

    //Not shifting left in the right place
  @Override
  public void shiftLeft(int num) {
    
    if (num <= 0) {
      return;
    }
    
    
    this.rest = new ElementNode(0, this.rest);
    
    this.shiftLeft(num - 1);
    
  }

  @Override
  public void shiftRight(int num) {
    // TODO Auto-generated method stub
    
    //Some how need to access last node in traversal
    
  }

  @Override
  public void addDigit(int digit) throws IllegalArgumentException {
    // TODO Auto-generated method stub
    
    
    this.number += digit;
    
    if (this.number > 10) { 
      this.number -= 10;
      this.rest.addDigit(1);
      return;
    }
    
    
  }

  @Override
  public int getDigitAt(int position) throws IllegalArgumentException {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public BigNumber copy() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public BigNumber add(BigNumber other) {
    // TODO Auto-generated method stub
    return null;
  }
  
  @Override
  public String toString() {
    String str = String.format("%d", this.number);
    return this.rest.toString() + str;
  }

}
