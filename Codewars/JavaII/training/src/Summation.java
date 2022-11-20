public class Summation {
    public static void main(String[] args) {
        System.out.println(summation(8));
    }

    public static int summation(int n) {
//        int result = 0;
//        for (int i = 0; i <= n; i++) {
//            result += i;
//        }
//        return result;

//        return n * (n+1) / 2;

        if (n == 1)
            return 1;
        return summation(n-1) + n;
    }
}
