public class NthPower {
   public static void main(String[] args) {
      System.out.println(nthPower(new int[] {1,2,3,4}, 2));
      System.out.println(nthPower(new int[] {3,1,2,2}, 3));
      System.out.println(nthPower(new int[] {3,1,2}, 2));
      System.out.println(nthPower(new int[] {1,2}, 2));
   }

   public static int nthPower(int[] array, int n) {
      if ((array.length - 1) < n) {
         return -1;
      }

      // Step 1
      // int result = array[n];
      // for (int i = 1; i < n; i++) {
      //    result = result * array[n]; 
      // }

      // Step 2
      return (int) Math.pow(array[n], n);
   }
}