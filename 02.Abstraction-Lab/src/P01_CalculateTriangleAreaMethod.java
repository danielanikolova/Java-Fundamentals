import java.util.Scanner;

public class P01_CalculateTriangleAreaMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        double area = calculateArea(base, height);

        System.out.printf("Area = %.2f", area);

    }

    private static double calculateArea(double base, double height) {
      return base*height/2;

    }
}
