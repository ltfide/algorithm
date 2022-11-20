public class BasicMathOperations {
    public static void main(String[] args) {
        System.out.println(basicMath("+", 12, 13));
    }

    public static Integer basicMath(String op, int v1, int v2)
    {
        int result = 0;
        switch (op) {
            case "+":
                result = v1 + v2;
                break;
            case "-":
                result = v1 - v2;
                break;
            case "*":
                result = v1 * v2;
                break;
            case "/":
                result = v1 / v2;
                break;
        }
        return result;
    }
}
