import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int totalCost = 0;
        for (int i = 0; i < arr.length; i++) {
            totalCost += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalCost + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minCost = arr[0];
        int maxCost = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minCost) {
                minCost = arr[i];
            }
            if (arr[i] > maxCost) {
                maxCost = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minCost +
                " рублей. Максимальная сумма трат за день составила " + maxCost + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double totalCost = 0;
        for (int i = 0; i < arr.length; i++) {
            totalCost += arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + totalCost / arr.length + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}