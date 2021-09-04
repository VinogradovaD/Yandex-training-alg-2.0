import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] string_array = string.split("\\p{javaSpaceChar}{1,}");
        int L = Integer.valueOf(string_array[0]);
        int K = Integer.valueOf(string_array[1]);
        string = scanner.nextLine();
        string_array = string.split("\\p{javaSpaceChar}{1,}");
        int[] cubes = new int[K];
        for (int i = 0; i < K; i++) {
            cubes[i] = Integer.valueOf(string_array[i]);
        }
        need_to_leave(L, K, cubes);
        scanner.close();
    }

    public static void need_to_leave(int L, int K, int[] cubes) {
        int half = L / 2;
        int left = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < K; i++) {
            if (L % 2 != 0 && cubes[i] == half) {
                System.out.println(cubes[i]);
                ans = 1;
            } else {
                if (cubes[i] > left && cubes[i] < half)
                    left = cubes[i];
                else if (cubes[i] < right && cubes[i] >= half)
                    right = cubes[i];
            }
        }
        if (ans == 0)
            System.out.println(left + " " + right);
    }
}