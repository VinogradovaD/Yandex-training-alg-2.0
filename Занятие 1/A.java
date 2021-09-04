import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int i = scanner.nextInt();
        int c = scanner.nextInt();
        int final_ = 0;

        switch (i){
            case 0:
                if (r != 0)
                    final_ = 3;
                else
                    final_ = c;
                break;
            case 1:
                final_ = c;
                break;
            case 4:
                if (r != 0)
                    final_ = 3;
                else
                    final_ = 4;
                break;
            case 6:
                final_ = 0;
                break;
            case 7:
                final_ = 1;
                break;
            default:
                final_ = i;
                break;
        }
        System.out.println(final_);
        scanner.close();
    }
}
