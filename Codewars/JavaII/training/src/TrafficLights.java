public class TrafficLights {
    public static void main(String[] args) {
        System.out.println(updateLight("green"));
        System.out.println(updateLight("blue"));
    }

    public static String updateLight(String current) {
        switch (current) {
            case "green" :
                return "yellow";
            case "yellow" :
                return "red";
            case "red" :
                return "green";
            default :
                throw new IllegalArgumentException();
        }
    }
}


