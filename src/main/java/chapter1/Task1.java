package chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

  private static final String TEXT = "Hello my friend how are???";

  public static void main(String[] args) {

    Map<Character, Integer> duplicate = countDuplicateCharacter((TEXT));
    System.out.println("duplicate = " + Arrays.toString(duplicate.entrySet().toArray()));

  }

  public static Map<Character, Integer> countDuplicateCharacter(String str) {
    Map<Character, Integer> result = new HashMap<>();
    for (char ch : str.toCharArray()) {
      result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
    }
    return result;
  }
}
