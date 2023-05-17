package hackerrank.easy;

import org.junit.jupiter.api.Test;

public class CovariantReturnTypes {

    public class Flower {
        String whatsYourName() {
            return "I have many names and types";
        }
    }

    public class Jasmine extends Flower {
        @Override
        String whatsYourName() {
            return "Jasmine";
        }
    }

    public class Lily extends Flower {
        @Override
        String whatsYourName() {
            return "Lily";
        }
    }

    public class Region {
        Flower yourNationalFlower() {
            return new Flower();
        }
    }

    public class WestBengal extends Region {
        @Override
        Jasmine yourNationalFlower() {
            return new Jasmine();
        }
    }

    public class AndhraPradesh extends Region {
        @Override
        Lily yourNationalFlower() {
            return new Lily();
        }
    }

    @Test
    void testCovariant() {
        String s = "AndhraPradesh";
        Region region = null;
        switch (s) {
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}
