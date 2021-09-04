import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] string_array = string.split("\\p{javaSpaceChar}{1,}");
        int n = Integer.valueOf(string_array[0]);
        int i = Integer.valueOf(string_array[1]);
        int j = Integer.valueOf(string_array[2]);

        if (i > j){
            int c;
            c = i;
            i = j;
            j = c;
        }
        int min = Math.min(n - j + i - 1,j - i - 1 );
        System.out.println(min);
	scanner.close();
    }
}