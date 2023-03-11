// (Дополнительное) Реализовать алгоритм сортировки слиянием
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class task1hardlist {
    public static void main(String[] args) {
        System.out.print("Введите количество целых чисел списка:");
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            Random rnd = new Random();
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                numbers.add(rnd.nextInt(100));
            }
            System.out.println("Начальный массив целых чисел:     " + numbers);
            long start = System.nanoTime(); 
            mergeSort(numbers);
            long finish = System.nanoTime();
            long elapsed = finish - start;
            System.out.println("Прошло времени, нс: " + elapsed); 
            System.out.println("Массив после сортировки слиянием: " + numbers);
        }
    }

    public static void mergeSort(ArrayList<Integer> list) {
        if (list.size() > 1) {
            int mid = list.size() / 2;
            ArrayList<Integer> leftList = new ArrayList<>(list.subList(0, mid));
            ArrayList<Integer> rightList = new ArrayList<>(list.subList(mid, list.size()));
            mergeSort(leftList);
            mergeSort(rightList);
            merge(list, leftList, rightList);
        }
    }

    private static void merge(ArrayList<Integer> list, ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        int i = 0, j = 0, k = 0;

        while (i < leftList.size() && j < rightList.size()) {
            if (leftList.get(i) < rightList.get(j)) {
                list.set(k++, leftList.get(i++));
            } else {
                list.set(k++, rightList.get(j++));
            }
        }

        while (i < leftList.size()) {
            list.set(k++, leftList.get(i++));
        }

        while (j < rightList.size()) {
            list.set(k++, rightList.get(j++));
        }
    }

    

}

