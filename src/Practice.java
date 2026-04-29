import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
      
      //Make map and put in some values
      Map<String, String> schools = new HashMap<>();
      schools.put("Auberon", "GRC");
      schools.put("Damien", "OSU");
      schools.put("Xinting", "UW");
      schools.put("Tina", "GRC");

      schools.put("Damien", "CPH");

      Map<String, Integer> scores = new HashMap<>();
      scores.put("Nupur", 345);
      scores.put("Alex", 120);
      scores.put("Stace", 67);

      int oldScore = scores.get("Stace");
      int newScore = oldScore + 10;
      scores.put("Stace", newScore);

      //For testing
      System.out.println(scores.get("Stace"));
      //System.out.println(schools.get("Damien"));
      printSS(schools);
      printSI(scores);
      //System.out.println(schools);

    }

    //Return a map that counts how many times each word shows up in the array
    //Ex: ["yes", "I", "will", "yes", "I", "said", "yes"]
    /*
    "yes": 3
    "I": 2
    "will": 1
    "said": 1
    */

    public static Map<String, Integer> countMap(String[] words)
    {
      
    }

    //For personal use
    public static void printSS(Map<String, String> y)
    {
      for(String x : y.keySet())
      {
        System.out.println("[" + x + ", " + y.get(x) + "]");
      }
    }

    public static void printSI(Map<String, Integer> y)
    {
      for(String x : y.keySet())
      {
        System.out.println("[" + x + ", " + y.get(x) + "]");
      }
    }
}