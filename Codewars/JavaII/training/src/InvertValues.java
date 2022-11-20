public class InvertValues {
    public static void main(String[] args) {
        int[] results = invert(new int[] {-1,-2,-3,-4,-5});

        for (int result : results) {
            System.out.println(result);
        }
    }

    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }

        return array;
    }
}
