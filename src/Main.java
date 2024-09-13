import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");

        int[] one = {1, 2, 3};
        int sum = 0;
        for (int element : one) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //task 2
        System.out.println("Task 2");

        int[] two = {1, 2, 3};
        int max = -1;
        for (final int current : two) {
            if (current > max) {
                max = current;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рубля.");
        int[] three = {1, 2, 3};
        int min = 1;
        for (final int current : three) {
            if (current < min) {
                min = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рубль.");

        //task 3
        System.out.println("Task 3");

        int[] four = {1, 2, 3, 4, 5};
        sum = 0;
        for (int element : four) {
            sum += element;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (sum / 4f) + " рублей");

        //task 4
        System.out.println("Task 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
