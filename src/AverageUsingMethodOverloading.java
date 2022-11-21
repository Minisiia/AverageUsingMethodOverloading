import java.util.Scanner;

public class AverageUsingMethodOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        double number1 = scanner.nextDouble();
        System.out.println("Введіть друге число");
        double number2 = scanner.nextDouble();
        System.out.println("Введіть третє число");
        double number3 = scanner.nextDouble();
        System.out.println("Введіть четверте число");
        double number4 = scanner.nextDouble();
        System.out.println("Введіть п'яте число");
        double number5 = scanner.nextDouble();
        double average3 = average(number1, number2, number3);
        double average4 = average(number1, number2, number3, number4);
        ;
        double average5 = average(number1, number2, number3, number4, number5);
        maxMinMid(average3, average4, average5);

    }

    static double average(double a1, double a2, double a3) {
        double c = (a1 + a2 + a3) / 3;
        return c;
    }

    static double average(double a1, double a2, double a3, double a4) {
        double c = (a1 + a2 + a3 + a4) / 4;
        return c;
    }

    static double average(double a1, double a2, double a3, double a4, double a5) {
        double c = (a1 + a2 + a3 + a4 + a5) / 5;
        return c;
    }

    static void maxMinMid(double a, double b, double c) {

        if (b < a) {
            if (a < c)
                System.out.println("Найменше значення - " + b + ", середнє значення - " + a + ", максимальне значення - " + c);
            else if (c < b)
                System.out.println("Найменше значення - " + c + ", середнє значення - " + b + ", максимальне значення - " + a);
            else
                System.out.println("Найменше значення - " + b + ", середнє значення - " + c + ", максимальне значення - " + a);
        } else if (a < c) {
            if (c < b)
                System.out.println("Найменше значення - " + a + ", середнє значення - " + c + ", максимальне значення - " + b);
            else
                System.out.println("Найменше значення - " + a + ", середнє значення - " + b + ", максимальне значення - " + c);
        } else
            System.out.println("Найменше значення - " + c + ", середнє значення - " + a + ", максимальне значення - " + b);
    }
}
