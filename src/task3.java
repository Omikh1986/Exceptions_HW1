/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
        новый массив, каждый элемент которого равен разности элементов двух входящих массивов
        в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
        Вместо массива может прийти null (обработать)*/

import java.io.*;
/*
public class task3 {
    public static void main(String[] args) {
        int[] arr1 = null;
        int[] arr2 = {1, 1};
        try {
            if (arr1.length == arr2.length) {
                int[] result = new int[arr1.length];
                for (int i = 0, j = 0, k = 0; i < arr1.length; i++, j++, k++) {
                    result[k] = arr1[i] - arr2[j];
                    System.out.print(result[k]);
                }
            } else {
                throw new RuntimeException("Длины исходящих массивов не равны");
            }
        } catch (NullPointerException e) {
            System.out.println("Один из массивов имеет значение null");
        }

    }
}*/

