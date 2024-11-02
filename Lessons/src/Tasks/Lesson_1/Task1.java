package Tasks.Lesson_1;

import java.util.Scanner;

public class Task1 {

    public static int[] createIntArray(int size, int left, int right) {

        //Создаем массив размера size

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * (right - left + 1)) + left; //генерируем числа в заданном диапазоне
        }

        for (int element : arr) {
            System.out.println(element);
        }
        return arr;
    }

    //Перегрузка для double
    public static double[] createDoubleArray(int size, int left, int right) {

        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (Math.random() * (right - left)) + left;
        }

        for (double element : arr) {
            System.out.println(element);
        }

        return arr;
    }

    //Нахождение максимального через сравнение >
    public static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static double max(double[] arr) {
        double max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    //Нахождение минимального через сравнение <
    public static int min(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static double min(double[] arr) {

        double min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    //Нахождение среднего через сумму элементов / количество
    public static double avg(int[] arr) {

        int sum = 0;

        for (int j : arr) {
            sum += j;
        }

        return (double) sum / arr.length;

    }

    public static double avg(double[] arr) {

        double sum = 0;

        for (double j : arr) {
            sum += j;
        }

        return  sum / arr.length;

    }

    //Сортировка пузырьком по возрастанию для int
    public static void intBubbleAsc(int[] arr) {

        for (int i = 0; i + 1 < arr.length; i++) {
            for (int j = 0; j + 1 < arr.length - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    arr[j + 1] = arr[j + 1] ^ arr[j];
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j + 1] ^ arr[j];
                }

            }
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    //Сортировка пузырьком по убыванию для int
    public static void intBubbleDesc(int[] arr) {

        for (int i = 0; i + 1 < arr.length; i++) {
            for (int j = 0; j + 1 < arr.length - i; j++) {
                if (arr[j + 1] > arr[j]) {
                    arr[j + 1] = arr[j + 1] ^ arr[j];
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j + 1] ^ arr[j];
                }

            }
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    //Перегрузки сортировок
    public static void doubleBubbleAsc(double[] arr) {

        for (int i = 0; i + 1 < arr.length; i++) {
            for (int j = 0; j + 1 < arr.length - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    double temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (double element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void doubleBubbleDesc(double[] arr) {

        for (int i = 0; i + 1 < arr.length; i++) {
            for (int j = 0; j + 1 < arr.length - i; j++) {
                if (arr[j + 1] > arr[j]) {
                    double temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (double element : arr) {
            System.out.print(element + " ");
        }
    }

    //Разделение массива на две части относительно опорного элемента
    public static int twoParts(int[] arr, int left, int right) {

       int stay = left;

       for (int i = left; i < right; i++) {
           if (arr[i] <= arr[right]) {
               int temp = arr[i];
               arr[i] = arr[stay];
               arr[stay] = temp;

               stay++;
           }
       }

        int temp = arr[stay];
        arr[stay] = arr[right];
        arr[right] = temp;

       return stay;
    }

    //Рекурсивный вызов для каждого подмассива
    public static void recursQuickSort(int[] arr, int left, int right) {

        if (left < right) {
            int stay = twoParts(arr, left, right); //нахождение середины
            recursQuickSort(arr, left, stay - 1); //для левого подмассива
            recursQuickSort(arr, stay + 1, right); //для правого
        }
    }

    //Быстрая сортировка (только по возрастанию)
    public static void QuickSortASC(int[] arr) {

        if (arr.length != 0) {
            recursQuickSort(arr, 0, arr.length - 1);
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int size;

        System.out.println("Enter array size");

        try {
            size = scn.nextInt();
        } catch (Exception e) {
            System.out.println("Error with size type!");
            return;
        }

        if (size <= 0 ) {
            System.out.println("Array size > 0!");
            return;
        }

        int left = 0 , right = 1;

        System.out.println("Want to enter left and right borders? y - yes");

        if (scn.next().equals("y")) {
            try {
                left = scn.nextInt();
                right = scn.nextInt();
            } catch (Exception e1) {
                System.out.println("Left and right borders are integer!");
            }
        }

        System.out.println("Data type:");

        int[] intArr;
        double[] doubleArr;
        String answ = scn.next();

        if (answ.equals("int")) {
            intArr = createIntArray(size, left, right);
            System.out.println("Max: " + max(intArr));
            System.out.println("Min: " + min(intArr));
            System.out.println("Avg: " + avg(intArr));
            System.out.println("Bubble sort ASC");
            intBubbleAsc(intArr);
            System.out.println();
            System.out.println("Bubble sort DESC");
            intBubbleDesc(intArr);
            System.out.println();
            System.out.println("Quick sort ASC");
            QuickSortASC(intArr);
        } else if (answ.equals("double")) {
            doubleArr = createDoubleArray(size, left, right);
            System.out.println("Max: " + max(doubleArr));
            System.out.println("Min: " + min(doubleArr));
            System.out.println("Avg: " + avg(doubleArr));
            doubleBubbleAsc(doubleArr);
            doubleBubbleDesc(doubleArr);
        } else {
            System.out.println("integer or double are allowed");
        }


    }
}
