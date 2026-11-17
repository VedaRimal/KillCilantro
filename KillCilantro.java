public class KillCilantro {
   public static void main(String[] args) {
      //killCilantro("testcilantrotest");
      //killCilantro("cilantrotest");
      //killCilantro("nothinghere");
      //killCilantro("testcilantro");
      //killCilantro("cilantrocilantrocilantro");
   }
   
   public static String killCilantro(String word) {
      int current = 0;
      int length = word.length();
      String fullString = "";
      String currentLetter = "";
      
      while (current < length) {
         currentLetter = word.substring(current, current + 1);
         
         if (currentLetter.equals("c")) {
            
         }
         
         else {
         
         }
      }
      
      return currentLetter;
   }
}