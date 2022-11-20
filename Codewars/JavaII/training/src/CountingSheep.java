public class CountingSheep {
    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
                            true,  true,  true,  true ,
                            true,  false, true,  false,
                            true,  false, false, true ,
                            true,  true,  true,  true ,
                            false, false, true,  null };
        System.out.println(countSheeps(array1));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int result = 0;
        for (Boolean sheep : arrayOfSheeps) {
            if (sheep != null && sheep) {
                result++;
            }
        }
        return result;
    }
}
