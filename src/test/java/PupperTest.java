import org.junit.*;
import static org.junit.Assert.*;

public class PupperTest {

  @Test
  public void Pupper_instantiatesCorrectly_true() {
    Pupper testPupper = new Pupper("Tyson","Pit Mix", 9,"Tyson enjoys taking long naps and eating treats by the window.");
    assertEquals(true, testPupper instanceof Pupper);
  }

  @Test
  public void getName_getsPupperName_Tyson() {
    Pupper testPupper = new Pupper("Tyson","Pit Mix", 9,"Tyson enjoys taking long naps and eating treats by the window.");
    assertEquals("Tyson", testPupper.getName());
  }

  @Test
  public void getBreed_getsPupperBreed_Pit_Mix() {
    Pupper testPupper = new Pupper("Tyson","Pit Mix", 9,"Tyson enjoys taking long naps and eating treats by the window.");
    assertEquals("Pit Mix", testPupper.getBreed());
  }

  @Test
  public void getAge_getsPupperAge_9() {
    Pupper testPupper = new Pupper("Tyson","Pit Mix", 9,"Tyson enjoys taking long naps and eating treats by the window.");
    assertEquals(9, testPupper.getAge());
  }

  @Test
  public void getBio_getsPupperBio_BioString() {
    Pupper testPupper = new Pupper("Tyson","Pit Mix", 9,"Tyson enjoys taking long naps and eating treats by the window.");
    assertEquals("Tyson enjoys taking long naps and eating treats by the window.", testPupper.getBio());
  }
}
