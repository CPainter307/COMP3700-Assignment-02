import java.util.Arrays;

public class Finder {

   private Finder() {}

   public static java.lang.Integer findMax(int[] intArray) {
      java.lang.Integer currentMax = null;
      if (intArray == null) {
         return currentMax;
      }
   
      if (intArray.length == 0) {
         return currentMax;
      }
   
      currentMax = intArray[0];
      for (int i = 0; i < (intArray.length); i++) {
         if (intArray[i] > currentMax) {
            currentMax = intArray[i];
         }
      }
      return currentMax;
   }

   public static java.lang.Integer findMin(int[] intArray) {
      java.lang.Integer currentMin = null;
      if (intArray == null) {
         return currentMin;
      }
   
      if (intArray.length == 0) {
         return currentMin;
      }
   
      currentMin = intArray[0];
      for (int i = 0; i < (intArray.length); i++) {
         if (intArray[i] < currentMin) {
            currentMin = intArray[i];
         }
      }
      return currentMin;
   
   }
}
