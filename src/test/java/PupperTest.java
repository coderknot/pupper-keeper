import org.junit.*;
import static org.junit.Assert.*;

public class PupperTest {

  @Test
  public void Pupper_instantiatesCorrectly_true() {
    Pupper testPupper = new Pupper("Tyson","Pit Mix", 9,"Tyson enjoys taking long naps and eating treats by the window.");
    assertEquals(true, testPupper instanceof Pupper);
  }
}
