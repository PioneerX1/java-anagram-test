import org.junit.*;
import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void verifyLength_True(){
    Anagram testGame = new Anagram();
    boolean expectedOutput = true;
    assertEquals(expectedOutput, testGame.verifyLength("coat", "taco"));
  }

  @Test
  public void verifyLetters_True(){
    Anagram testGame = new Anagram();
    boolean expectedOutput = true;
    assertEquals(expectedOutput, testGame.verifyLetters("coat", "taco"));
  }

  @Test
  public void verifyLandL_True(){
    Anagram testGame = new Anagram();
    boolean expectedOutput = true;
    assertEquals(expectedOutput, testGame.verifyLandL("coat", "taco"));
  }



}
