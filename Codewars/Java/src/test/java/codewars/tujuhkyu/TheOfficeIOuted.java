package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Lutfi Dendiansyah
 * @created 01/05/2023 06:13
 */
public class TheOfficeIOuted {

    public static String outed(Person[] meet, String boss) {
        double ratings = 0;
        for (Person person : meet) {
            if (person.getName().equals(boss)) {
                ratings += person.getRating() * 2;
            } else {
                ratings += person.getRating();
            }
        }
        if ((ratings / meet.length) <= 5) {
            return "Get Out Now!";
        } else {
            return "Nice Work Champ!";
        }
    }

    public String outedII(Person[] meet, String boss) {
        double averageRating = Arrays.stream(meet)
                .mapToDouble(person -> person.getName().equals(boss) ?
                        person.getRating() * 2 : person.getRating())
                .average()
                .orElse(0.0);

        if (averageRating <= 5) {
            return "Get Out Now!";
        } else {
            return "Nice Work Champ!";
        }
    }

    @Test
    public void basic1() {
        Person[] meet = new Person[] {
                new Person("tim", 0),
                new Person("jim", 2),
                new Person("randy", 0),
                new Person("sandy", 7),
                new Person("andy", 0),
                new Person("katie", 5),
                new Person("laura", 1),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 0)
        };
        assertEquals("Get Out Now!", outed(meet, "laura"));
    }

    @Test
    public void basic2() {
        Person[] meet = new Person[] {
                new Person("tim", 1),
                new Person("jim", 3),
                new Person("randy", 9),
                new Person("sandy", 6),
                new Person("andy", 7),
                new Person("katie", 6),
                new Person("laura", 9),
                new Person("saajid", 9),
                new Person("alex", 9),
                new Person("john", 9),
                new Person("mr", 8)
        };
        assertEquals("Nice Work Champ!", outed(meet, "katie"));
    }

    @Test
    public void basic3() {
        Person[] meet = new Person[] {
                new Person("tim", 2),
                new Person("jim", 4),
                new Person("randy", 0),
                new Person("sandy", 5),
                new Person("andy", 8),
                new Person("katie", 6),
                new Person("laura", 2),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 8),
        };
        assertEquals("Get Out Now!", outed(meet, "john"));
    }
}

class Person {
    private String name;
    private int rating;

    public Person(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }
}
