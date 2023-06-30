import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    /* ToDo: insert a test here */
    int[] primeNumbers = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,
                          67,71,73,79,83,89,97,101,103,107,109,113,127,131,
                          137,139,149,151,157,163,167,173,179,181,191,193,197,
                          199,211,223,227,229,233]
    for(int num : primeNumbers){
      assertEquals("Test Prime Number: " + num, true, PrimeCheck.isPrime(num));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    /* ToDo: insert a test here */
    int[] nonPrimeNumbers = [4,6,8,9,10,12,14,15,16,18,20,21,22,24,25,26,27,28]
    for(int num : nonPrimeNumbers){
      assertEquals("Test Non Prime Number: " + num, false, PrimeCheck.isPrime(num));
    }
  }
}
