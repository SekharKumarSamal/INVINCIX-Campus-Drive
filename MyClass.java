import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        System.out.println("X1:");
        int x1 = scanner.nextInt();
        System.out.println("Y1:");
        int y1 = scanner.nextInt();
        System.out.println("X2:");
        int x2 = scanner.nextInt();
        System.out.println("Y2:");
        int y2 = scanner.nextInt();

        int[] x = {
            (x2 - x1),
            (y2 - y1)
        };
        // X-Axis vector.
        int[] y = {
            1,
            0
        };

        System.out.println("Angle of inclination:");
        System.out.println(Math.acos((x[0] * y[0] + x[1] * y[1]) / Math.sqrt(x[0] * x[0] + x[1] * x[1]) * Math.sqrt(y[0] * y[0] + y[1] * y[1])) * 180 / Math.PI);
    }
}