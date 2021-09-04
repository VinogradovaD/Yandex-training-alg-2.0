import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] string_array = string.split("\\p{javaSpaceChar}{1,}");
        int n = Integer.valueOf(string_array[0]);
        string = scanner.nextLine();
        string_array = string.split("\\p{javaSpaceChar}{1,}");
        int house[] = new int[n];
        for (int i = 0; i < n; i++){
            house[i] = Integer.valueOf(string_array[i]);
        }
        int ans = (int)Math.ceil(n/2);
        System.out.println(house[ans]);
        scanner.close();
    }
}