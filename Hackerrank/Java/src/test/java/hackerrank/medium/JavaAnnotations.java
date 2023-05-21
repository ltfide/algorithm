package hackerrank.medium;

import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
    int budgetLimit() default 0;

    String userRole() default "GUEST";
}

class FamilyMember {

    @FamilyBudget(budgetLimit = 100, userRole = "SENIOR")
    public void seniorMember(int budget, int moneySpend) {
        System.out.println("Senior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }

    @FamilyBudget(budgetLimit = 50, userRole = "JUNIOR")
    public void juniorUser(int budget, int moneySpend) {
        System.out.println("Junior Member");
        System.out.println("Spend: " + moneySpend);
        System.out.println("Budget Left: " + (budget - moneySpend));
    }
}

public class JavaAnnotations {

    @Test
    void testSolution() throws IOException {
        Scanner sc = new Scanner(Path.of("sample/java_annotations.txt"));
        sc.nextInt();

        while (sc.hasNext()) {
            String role = sc.next();
            int spend = sc.nextInt();

            try {
                Class<FamilyMember> annotatedClass = FamilyMember.class;
                FamilyMember familyMember = annotatedClass.getDeclaredConstructor().newInstance();
                Method[] methods = annotatedClass.getMethods();

                for (Method method : methods) {
                    if (method.isAnnotationPresent(FamilyBudget.class)) {
                        FamilyBudget family = method.getAnnotation(FamilyBudget.class);
                        String userRole = family.userRole();
                        int budgetLimit = family.budgetLimit();

                        if (userRole.equals(role)) {
                            if (spend <= budgetLimit) {
                                method.invoke(familyMember, budgetLimit, spend);
                            } else {
                                System.out.println("Budget Limit Over");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
