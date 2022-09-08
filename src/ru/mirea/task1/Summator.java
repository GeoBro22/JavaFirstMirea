package ru.mirea.task1;


public class Summator {
    public static void main(String[] args) {
        int[] arr = new int[(int) (Math.random() * 100 + 1)];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = (int) (Math.random() * 100 + 1);
        }
        int SumFor = 0, SumWhile = 0, SumDoWhile = 0;
        for (int j : arr) {
            SumFor += j;
        }
        int i = 0;
        while (i < arr.length) {
            SumWhile += arr[i];
            i++;
        }
        i = 0;
        do {
            SumDoWhile += arr[i];
            i++;
        }
        while (i < arr.length);
        System.out.print("Сумма через оператор for: " + SumFor + "\nСумма через оператор while: " + SumWhile + "\nСумма через оператор dowhile: " + SumDoWhile);
    }
}
