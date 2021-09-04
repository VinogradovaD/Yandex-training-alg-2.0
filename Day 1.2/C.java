import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        min_sum(string);
        scanner.close();
    }

    public static void min_sum(String string) {
        char [] chars = string.toCharArray();
        int min_sum = 0;
        int n = chars.length;
        int i = 0;
        int j = n - 1;
        while (i != n/2){
            if (chars[i] != chars[j])
                min_sum++;
            i++;
            j--;
        }
        System.out.println(min_sum);
    }
}