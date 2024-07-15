public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");

        int [] payment = {90800, 110000, 113232, 94000, 119203};
        int totalPayment =0;
        for (int i=0; i< payment.length; i++) {
            totalPayment += payment[i];
        }
        System.out.println("Сумма затрат компании за месяц составит " + totalPayment + " рублей");


        System.out.println("task 2");

        int [] paymentTwo = {90800, 110000, 113232, 94000, 119203};
        int maxPayment = paymentTwo [0];
        int minPayment = paymentTwo [0];
        for (final int current : paymentTwo) {
            if (current > maxPayment) {
                maxPayment = current;
            }
            if (minPayment > current) {
                minPayment = current;
            }
        }

        System.out.println("Максимальная сумма трат за неделю составляет " + maxPayment + " рублей");
        System.out.println("Минимальная сумма трат за неделю составляет " + minPayment + " рублей");

        System.out.println("task 3");

        int [] paymentThird = {970800, 160000, 113232, 95000, 119203};
        double totalExpense = 0;
        double mediumExpense =0;
        for (int i = 0; i < paymentThird.length; i++) {
            totalExpense += paymentThird[i];
        }
        mediumExpense = totalExpense / paymentThird.length;
        System.out.println("Средняя сумма затрат за месяц состовляет " + mediumExpense + " рублей");

        System.out.println("task 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i>= 0; i--) {
            System.out.print(reverseFullName[i]);

        }








    }
}