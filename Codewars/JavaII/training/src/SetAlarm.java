public class SetAlarm {
    public static void main(String[] args) {
        System.out.println(setAlarm(true, true));
        System.out.println(setAlarm(true, false));
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }
}
