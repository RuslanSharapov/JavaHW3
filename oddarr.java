//               Пусть дан произвольный список целых чисел, удалить из него чётные числа


import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class oddarr {
    public static void main(String[] args) {       
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int n = sc.nextInt();
        sc.close();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20);
        }        
        System.out.println("Рандомный массив: " + Arrays.toString(arr));

        // создаем новый массив без четных чисел
        int[] oddArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddArr[count] = arr[i];
                count++;
            }
        }
        
        // Копируем oddArr обратно в исходный массив и изменяем до кол-ва не чет. чисел
        arr = Arrays.copyOf(oddArr, count);
        System.out.println("Без четных чисел: " + Arrays.toString(arr));
    }
}
