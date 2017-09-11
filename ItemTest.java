import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ItemTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
   public void testItemCreated() {
    Item a = new Item(0.15,1000);
    
    assertEquals(1000.0, a.price);
    assertEquals(0.15, a.discount);
  }
   
   public void testSalePrice1000itemWithoutDiscountAndLessThan1000() {
    Item a = new Item(0.5,500);
    Item a1 = new Item(0.15,600);
    Item a2 = new Item(0.20,800);
    
    assertEquals(500.0, a.salePrice1000());
    assertEquals(600.0, a1.salePrice1000());
    assertEquals(800.0, a2.salePrice1000());
  }
   
   public void testSalePrice1000itemWithDiscountAndMoreThan1000() {
    Item b = new Item(0.5,1001);
    Item b1 = new Item(0.15,2000);
    Item b2 = new Item(0.6,2500);
    
    assertEquals(500.5, b.salePrice1000());
    assertEquals(1700.0, b1.salePrice1000());
    assertEquals(1000.0, b2.salePrice1000());
  }
  
 
}