
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.print("Введите количество целых чисел списка:");
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            Random random = new Random();
            for (int i = 0; i < num; i++) {
                numbers.add(random.nextInt(100));
            }
            System.out.println("Задаем список: " + numbers);
            int min = numbers.get(0);
            int max = numbers.get(0);
            int sum = 0;

            for (int i = 0; i < num; i++) {
                int n = numbers.get(i);

                if (n < min) {
                    min = n;
                }

                if (n > max) {
                    max = n;
                }

                sum += n;
            }

            double average = (double) sum / num;
            System.out.println("Минимальное число: " + min);
            System.out.println("Максимальное: " + max);
            System.out.println("Среднее арифметическое: " + average);
        }
    }
}
