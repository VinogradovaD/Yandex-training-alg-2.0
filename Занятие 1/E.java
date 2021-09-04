import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] string_array = string.split("\\p{javaSpaceChar}{1,}");
        int d = Integer.valueOf(string_array[0]);
        string = scanner.nextLine();
        string_array = string.split("\\p{javaSpaceChar}{1,}");
        int point[] = new int[2];
        for (int i = 0; i < 2; i++){
            point[i] = Integer.valueOf(string_array[i]);
        }
        int x1 = 0;
        int y1 = 0;
        int x2 = d;
        int y2 = 0;
        int x3 = 0;
        int y3 = d;
        int x0 = point[0];
        int y0 = point[1];
        int v_p1 = (x1-x0)*(y2-y1)-(x2-x1)*(y1-y0);
        int v_p2 = (x2-x0)*(y3-y2)-(x3-x2)*(y2-y0);
        int v_p3 = (x3-x0)*(y1-y3)-(x1-x3)*(y3-y0);
        if (v_p1 >= 0 && v_p2 >= 0 && v_p3 >= 0)
            System.out.println(0);
        else {
            int dist_ax = (int) Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2));
            int dist_bx = (int) Math.sqrt(Math.pow(x0 - x2, 2) + Math.pow(y0 - y2, 2));
            int dist_cx = (int) Math.sqrt(Math.pow(x0 - x3, 2) + Math.pow(y0 - y3, 2));
            int min = Math.min(dist_ax, Math.min(dist_bx, dist_cx));
            if (min == dist_ax)
                System.out.println(1);
            else if (min == dist_bx)
                System.out.println(2);
            else
                System.out.println(3);
        }
    }
}