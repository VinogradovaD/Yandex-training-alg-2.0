import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] string_array = string.split("\\p{javaSpaceChar}{1,}");
        int N = Integer.valueOf(string_array[0]);
        string = scanner.nextLine();
        int[] folders = new int[N];
        string_array = string.split("\\p{javaSpaceChar}{1,}");
        for (int i = 0; i < N; i++) {
            folders[i] = Integer.valueOf(string_array[i]);
        }
        min_time(N, folders);
    }

    public static void min_time(int N, int[] folders) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += folders[i];
            if (folders[i] > max)
                max = folders[i];
        }
        System.out.println(sum - max);
    }
}