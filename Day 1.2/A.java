import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = 1;
        Scanner scanner = new Scanner(System.in);
        while (num != 0) {
            num = scanner.nextInt();
            list.add(num);
        }
        int max = Collections.max(list);
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == max)
                sum ++;
        }
        System.out.println(sum);
        scanner.close();
    }
}

