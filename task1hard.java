// (Дополнительное) Реализовать алгоритм сортировки слиянием
import java.util.Random;
import java.util.Scanner;

public class task1hard {
    public static void main(String[] args) {
        System.out.print("Введите размер массива:" );
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            Random rdm = new Random();
            int[] rdm_list = new int[num];
            for (int i = 0; i < num; i++) {
                rdm_list[i] = rdm.nextInt(100);
                System.out.print(rdm_list[i] + "  ");
            }
            System.out.println();
            long start = System.nanoTime();    
            mergeSort(rdm_list);
            long finish = System.nanoTime();
            long elapsed = finish - start;
            System.out.println("Прошло времени, нс: " + elapsed);      
            for (int i = 0; i < num; i++) {
                System.out.print(rdm_list[i] + "  ");

            }
        }
    }
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            rightArr[i - mid] = arr[i];
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }

    public static void merge(int[] leftArr, int[] rightArr, int[] resArr) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                resArr[k] = leftArr[i];
                i++;
            } else {
                resArr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftArr.length) {
            resArr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArr.length) {
            resArr[k] = rightArr[j];
            j++;
            k++;
        }

    }

    

    

}