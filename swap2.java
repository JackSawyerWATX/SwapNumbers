import java.util.Scanner;

public class swap2 {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter x & y");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before swapping \nx = " + x + "\ny = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping \nx = " + x + "\ny = " + y);
    }
}