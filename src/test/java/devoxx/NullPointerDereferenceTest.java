package devoxx;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerDereferenceTest {

  private NullPointerDereference underTest = new NullPointerDereference();

  @Test
  public void shouldSearchForAnimalID() {
    assertEquals(underTest.searchForAnimalID("Zouheir"), -1);
  }

  @Test(expected = NullPointerException.class)
  @Ignore
  public void ignoredTestThatWouldCoverBug() {
    underTest.searchForAnimalID("");
  }
}
