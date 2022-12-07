/*4.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 и возвращающий новый массив, каждый элемент которого равен частному элементов двух
 входящих массивов в той же ячейке. Если длины массивов не равны,
 необходимо как-то оповестить пользователя.
 Важно: При выполнении метода единственное исключение, которое пользователь может увидеть
  - RuntimeException, т.е. ваше*/

public class task4 {
    public static void main(String[] args) {
        int[] arr1 = {0, 1};
        int[] arr2 = {1, 0};
        try {
            if (arr1.length == arr2.length) {
                int[] result = new int[arr1.length];
                for (int i = 0, j = 0, k = 0; i < arr1.length; i++, j++, k++) {
                    if (arr2[j] != 0) {
                        result[k] = arr1[i] / arr2[j];
                        System.out.println(result[k]);
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Ошибка, необходимо проверить равны ли размеры массивов, " +
                    "нет ли деления на ноль, не содержит ли массив null");
        }
    }
}

