import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberPair pair = new NumberPair();
        int choice;

        do {
            System.out.println("\n===== МЕНЮ =====");
            System.out.println("1. Ввод двух чисел");
            System.out.println("2. Сложение чисел");
            System.out.println("3. Вычитание чисел");
            System.out.println("4. Произведение чисел");
            System.out.println("0. Завершение программы");
            System.out.print("Выберите пункт: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите первое число: ");
                    double a = scanner.nextDouble();
                    System.out.print("Введите второе число: ");
                    double b = scanner.nextDouble();
                    pair.inputNumbers(a, b);
                    System.out.println("Числа сохранены.");
                    break;

                case 2:
                    if (!pair.isInitialized()) {
                        System.out.println("Сначала введите числа (пункт 1).");
                    } else {
                        System.out.printf("%.2f + %.2f = %.2f%n",
                                pair.getFirst(), pair.getSecond(), pair.add());
                    }
                    break;

                case 3:
                    if (!pair.isInitialized()) {
                        System.out.println("Сначала введите числа (пункт 1).");
                    } else {
                        System.out.printf("%.2f - %.2f = %.2f%n",
                                pair.getFirst(), pair.getSecond(), pair.subtract());
                    }
                    break;

                case 4:
                    if (!pair.isInitialized()) {
                        System.out.println("Сначала введите числа (пункт 1).");
                    } else {
                        System.out.printf("%.2f * %.2f = %.2f%n",
                                pair.getFirst(), pair.getSecond(), pair.multiple());
                    }
                    break;

                case 0:
                    System.out.println("Завершение работы программы...");
                    break;

                default:
                    System.out.println("Неверный пункт меню. Попробуйте снова.");
            }
        } while (choice != 0);

        scanner.close();
    }
}