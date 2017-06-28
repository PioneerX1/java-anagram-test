import java.util.*;

public class Anagram {

  public boolean verifyLength(String input1, String input2) {
    if (input1.length() == input2.length()) {
      return true;
    } else { return false; }
  }
  public boolean verifyLetters(String input1, String input2) {
    char[] input1Array = input1.toCharArray();
    char[] input2Array = input2.toCharArray();
    int count = 0;
    for (int i = 0; i < input1.length(); i++){
      for (int x = 0; x < input1.length(); x++){
        if ( input1Array[i] == input2Array[x]){
          count++;
        } else {
          System.out.println("Not a match");
        }
      }
    }
    if (count == input1.length()){
      return true;
    } else {
      return false;
    }
  }
}
