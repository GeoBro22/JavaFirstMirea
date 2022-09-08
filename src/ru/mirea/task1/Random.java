package ru.mirea.task1;
import java.util.Arrays;
public class Random {
    public static void main(String[] args) {
        int[] arr = new int[(int) (Math.random() * 100 + 1)];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(arr));
        int c;
        for (int i = arr.length; i > 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                if (arr[j] < arr[j - 1])
                {
                    c = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = c;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
