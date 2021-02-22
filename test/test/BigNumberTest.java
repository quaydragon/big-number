package test;

import static org.junit.Assert.assertEquals;

import bignumber.BigNumber;
import bignumber.ElementNode;
import bignumber.EmptyNode;
import org.junit.Before;
import org.junit.Test;

public class BigNumberTest {
  public BigNumber listOfNumbers;
  public BigNumber partialListOfNumbers;
  public BigNumber emptyListOfNumbers;
  public BigNumber numbers;

  @Before
  public void setUp() throws Exception {
    
    emptyListOfNumbers = new EmptyNode();
    
    partialListOfNumbers = new ElementNode(1,
        new ElementNode(2, new ElementNode(3,
            new EmptyNode())));
    
    listOfNumbers = new ElementNode(4, partialListOfNumbers);
    
    numbers = new ElementNode(0, new EmptyNode());
  }

  //TODO: add assert equals     
  @Test
  public void testString() {
    System.out.println(numbers.toString());
  }
  //TODO: add assert equals
  @Test
  public void testShiftLeft() {
    numbers.shiftLeft(3);
    System.out.println(numbers.toString());

    
  }
  
  @Test
  public void testAddDigit() {
    numbers.shiftLeft(1);
    numbers.addDigit(9);
    numbers.addDigit(7);
    numbers.shiftLeft(1);
//    numbers.shiftLeft(1);
    System.out.println(numbers.toString());
  }

}
