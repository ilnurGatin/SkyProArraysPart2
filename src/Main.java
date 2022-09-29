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
        int minSpending = arr[0];
        int maxSpending = arr[0];
        for (int current : arr) {
            if (current < minSpending) {
                minSpending = current;
            } else if (current > maxSpending) {
                maxSpending = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ minSpending + " рублей.");
        System.out.println("Максимальная сумма трат за день составила "+ maxSpending + " рублей.");

        // Task 3
        double days = arr.length;
        double average = sum / days;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        //Task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char tmp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = tmp;
        }

        for (char c : reverseFullName) {
            System.out.print(c);
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