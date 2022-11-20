public class WideMouthedFrog {
    public static void main(String[] args) {
        System.out.println(mouthSize("toucan"));
        System.out.println(mouthSize("ant bear"));
        System.out.println(mouthSize("alligator"));
        System.out.println(mouthSize("ALLIGATOR"));
    }

    public static String mouthSize(String animal) {
        if ("alligator".equals(animal.toLowerCase())) {
            return "small";
        } else {
            return "wide";
        }
    }
}
