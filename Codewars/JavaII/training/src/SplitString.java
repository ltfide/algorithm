public class SplitString {
    public static void main(String[] args) {
        String[] results =  stringToArray("Lutfi Dendiansyah");
        for (String result : results) {
            System.out.println(result);
        }
    }

    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
}
