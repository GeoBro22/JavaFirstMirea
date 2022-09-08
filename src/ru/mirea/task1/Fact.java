package ru.mirea.task1;
import java.util.Scanner;
public class Fact {
    static void fact(int a){
        int b=1;
        for (int i=2;i<=a;i++)
            b*=i;
        System.out.print("Факториал числа равен - "+b);
    }
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.print("Введите число: ");
        int num=t.nextInt();
        fact(num);
    }
}
