import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task1");

        double a, b;

        //ввід сторони а
        System.out.print("Enter side a: ");
        a = scanner.nextDouble();

        // Перевірка на додатність значення a
        if (a < 0) {
            System.out.println("Side a must be positive.");
            return;
        }

        //ввід сторони b
        System.out.print("Enter side b: ");
        b = scanner.nextDouble();

        // Перевірка на додатність значення b
        if (b < 0) {
            System.out.println("Side b must be positive.");
            return;
        }

        //обрахунок площі та периметра
        double area = a * b, perimeter = 2 * a + 2 * b;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
