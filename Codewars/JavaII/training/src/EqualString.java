public class EqualString {
    public static void main(String[] args) {
        System.out.println(feast("great blue heronn ","garlic nann"));
        System.out.println(feast("brown bear","bear claw"));
    }

    public static boolean feast(String beast, String dish) {
        if (beast.length() > 1 && dish.length() > 1) {
            String lastStringBeast = beast.trim().toLowerCase();
            String lastStringDish = dish.trim().toLowerCase();

            return lastStringBeast.charAt(lastStringBeast.length() - 1) == lastStringDish.charAt(lastStringDish.length() - 1) && lastStringBeast.charAt(0) == lastStringDish.charAt(0);
        }

        return false;
    }
}
