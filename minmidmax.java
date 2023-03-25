//            Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


import java.util.ArrayList;
import java.util.Random;

public class minmidmax {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    Random rand = new Random();
    for (int i = 0; i < 10; i++) {
        arr.add(rand.nextInt(20));
    }
    System.out.println("Рандомный массив: " + arr);

    // Находим минимальное и максимальное значения
    int min = arr.get(0);
    int max = arr.get(0);
    int sum = 0;
    double mid;

    for (int i = 0; i < arr.size(); i++) {
        int num = arr.get(i);
        if (num < min) {
            min = num;
        }
        if (num > max) {
            max = num;
        }
        sum += num;
    }

    mid = (double) sum / arr.size();

    System.out.println("Минимальное значение: " + min);
    System.out.println("Максимальное значение: " + max);
    System.out.println("Среднее значение: " + mid);
  }
}
