public class Main {
    public static void main(String[] args) {

        //task 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила "+ sum + " рублей");

        //task 2
        int minSpending = 200_000;
        int maxSpending = 100_000;
        for (int current : arr) {
            if (current < minSpending) {
                minSpending = current;
            }
            if (current > maxSpending) {
                maxSpending = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ minSpending + " рублей.");
        System.out.println("Максимальная сумма трат за день составила "+ maxSpending + " рублей.");

        // Task 3
        double days = 30.0;
        double average = sum / days;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        //Task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}