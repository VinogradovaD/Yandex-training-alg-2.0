import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] string_array = string.split("\\p{javaSpaceChar}{1,}");
        int[] house = new int[10];

        for (int i = 0; i < 10; i++) {
            house[i] = Integer.valueOf(string_array[i]);
        }
        max_dist(house);
	scanner.close();
    }

    public static void max_dist(int[] house) {
        int max_dist = Integer.MIN_VALUE;
        int dist = 0;
        for (int i = 0; i < 10; i++) {
            if (house[i] == 1) {
                int min_dist = Integer.MAX_VALUE;
                for (int j = 0; j < 10; j++) {
                    if (house[j] == 2) {
                        dist = Math.abs(i - j);
                        if (min_dist > dist)
                            min_dist = dist;
                    }
                }
                if (max_dist < min_dist)
                    max_dist = min_dist;
            }
        }
        System.out.println(max_dist);
    }
}