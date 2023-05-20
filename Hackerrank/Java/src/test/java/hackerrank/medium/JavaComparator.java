package hackerrank.medium;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        int scoreCompare = Integer.valueOf(o2.score).compareTo(Integer.valueOf(o1.score));
        int nameCompare = o1.name.compareTo(o2.name);
        return (scoreCompare == 0) ? nameCompare : scoreCompare;
    }
}

class Player {

    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class JavaComparator {

    @Test
    void test() throws IOException {
        Scanner sc = new Scanner(Path.of("sample/java_comparator.txt"));
        int n = sc.nextInt();

        Player[] players = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            players[i] = new Player(sc.next(), sc.nextInt());
        }

        Arrays.sort(players, checker);
        for (Player player : players) {
            System.out.printf("%s %s\n", player.name, player.score);
        }
    }
}
