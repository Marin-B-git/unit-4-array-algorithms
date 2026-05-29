public class ArrayAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private int[] intArray;

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */

   public ArrayAlgorithms(int arraySize) {
      // REQUIRED: initialize intArray to be of size arraySize
      intArray = new int[arraySize];
   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      for (int i = 0; i < intArray.length; i++) 
      {
         intArray[i] = (int) (Math.random() * 100);
      }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      for (int i = 0; i < intArray.length; i++)
      {
         intArray[i] = startNum + i;
      }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int max = intArray[0];
      for (int i = 1; i < intArray.length; i++)
      {
         if (intArray[i] > max)
         {
            max = intArray[i];
         }
      }
      return max;
   }
   

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      for (int i = 0; i < intArray.length; i++) 
      {
         for (int j = i + 1; j < intArray.length; j++)
         {
            if (intArray[i] == intArray[j])
            {
               return true;
            }
         }
      }
      return false;    }

   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
      for (int num : intArray)       {
         if (num == intToFind)
         {
            return true;
         }
      }
      return false; 
   }

   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      System.out.println("Testing Methods");
      ArrayAlgorithms algo = new ArrayAlgorithms(10); 
      
      // 2) Populate the array with random numbers
      algo.populateArrayWithRandom();
      
      System.out.print("Array Contents: "); 
      for (int i = 0; i < algo.intArray.length; i++)
      {
         System.out.print(algo.intArray[i] + " ");
      }
      System.out.println();
      
      // 3) Call and print the result of EACH REQUIRED method
      System.out.println("Max Value: " + algo.findMax());
      System.out.println("Has Duplicates? " + algo.hasDuplicates());
      System.out.println("Is 50 in array? " + algo.isInArray(50));
      
      System.out.println("\nTesting Sequential Population:");
      algo.populateArrayWithSequential(5);
      System.out.print("Sequential Array (starting at 5): ");
      for (int i = 0; i < algo.intArray.length; i++) {
         System.out.print(algo.intArray[i] + " ");
      }
      System.out.println();
      System.out.println("New Max Value: " + algo.findMax());
      System.out.println("Has Duplicates? " + algo.hasDuplicates());
   }
}
