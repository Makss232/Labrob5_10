public class Main {
    public static void main(String[] args) {
        //Task1
        for (int a = 500; a <= 650; a += 10) {
            System.out.println(a);
        }

        int b = 500;
        while (b <= 650) {
            System.out.println(b);
            b += 10;
        }

        int c = 500;
        do {
            System.out.println(c);
            c += 10;
        } while (c<= 650);
        //Task 2
        int a = 2;
        int value = 2 * a - 1;
        while (value < 5000) {
            System.out.println(value);
            a++;
            value = 2 * a - 1;

        }
        //Taks3
        int number = 10;
        System.out.print("Додатні дільники числа " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && i > 0) {
                System.out.print(i + " ");
            }
        }
        //Task4
        int n = 10;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факторіал числа " + n + " дорівнює " + factorial);

        //with while:

        int m = 10;
        int factor = 1;
        int o = 1;
        while (o <= n) {
            factor *= o;
            o++;
        }
        System.out.println("Факторіал числа " + m + " дорівнює " + factor);
        //Task5
        int count = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                int h1 = i / 10;//перша цифра години
                int h2 = i % 10;//друга цифра години
                int m1 = j / 10;//перша цифра хвилини
                int m2 = j % 10;//друга цифра хвилин
                if (h1 == m2 && h2 == m1)  { //перевіряєм чи співпадає, якщо так то збыльшуєм
                    count++;
                }
            }
        }
        System.out.println("Кількість співпадінь симетричних комбінацій цифр на годиннику: " + count);
    }

}