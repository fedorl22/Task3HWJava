// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.print("Введите количество целых чисел списка:");
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            Random random = new Random();

            for (int i = 0; i < num; i++) {
                numbers.add(random.nextInt(100));
            }
            System.out.println("Начальный массив: " + numbers);
            Iterator<Integer> iterator = numbers.iterator();

            while (iterator.hasNext()) {
                int number = iterator.next();
                if (number % 2 == 0) {
                    iterator.remove();
                }
            }

            System.out.println("Массив после удаления четных чисел: "+numbers);
        }
    }
}

