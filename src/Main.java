public class Main {
    public static void main(String[] args) {
        //Задание 1.1
        System.out.println("Задание 1.1");

        int fee1 = 29000;
        int accumulation1 = 0;
        int i = 0;
        while (accumulation1 <= 2_459_000) {
            for (; accumulation1 <= 2_459_000; i++) {
                accumulation1 = accumulation1 + fee1;
                accumulation1 = accumulation1 + accumulation1 / 100;

                System.out.println("Месяц " + i + " сумма накоплений равна " + accumulation1);
                System.out.println(i);
            }
            System.out.println("За " + i + " месяца сумма накоплений равна " + accumulation1);
        }

        //Задание 1.2
        System.out.println("Задание 1.2");
        int j = 1;
        while (j < 11) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println(" ");
        int d = 10;
        for (d = 10; d > 0; d--) {

            System.out.print(d + " ");
        }
        System.out.println(" ");
        //Задание 1.3
        System.out.println("Задание 1.3");
        int population = 12_000_000;
        double birthRate = (double) 17 / 1000;
        double deathRate = (double) 8 / 1000;
        for (int b = 1; b < 11; b++) {
            population = population + (int) (population * birthRate) - (int) (population * deathRate);
            System.out.println("Year - " + b + "  Population : " + population);
        }
        //Задание 2.1
        System.out.println("Задание 2.1");
        int salary = 15_000;
        int total = 0;
        int f = 0;
        while (total < 12000000) {
            total = total + total / 100 * 7;
            total = total + salary;
            f = f + 1;
            System.out.println("Месяц " + f + " сумма накоплений равна " + total);
        }
        System.out.println(f);
        System.out.println(total);
        // Задание 2.2
        System.out.println("Задание 2.2");
        int salary1 = 15_000;
        int total1 = 0;
        int f1 = 0;
        while (total1 < 12000000) {
            f1 = f1 + 1;
            total1 = total1 + total1 / 100 * 7;
            total1 = total1 + salary1;
            if (f1 % 6 == 0) {

                System.out.println("Месяц " + f1 + " сумма накоплений равна " + total1);
            }
        }
        //Задание 2.3
        System.out.println("Задание 2.3");
        int salary2 = 15000;
        int total2 = 0;
        for (int f2 = 0; f2 <= 9 * 12; f2++) {
            total2 = total2 + total2 / 100 * 7;
            total2 = total2 + salary2;
            if (f2 % 6 == 0) {
                System.out.println("Месяц " + f2 + " сумма накоплений равна " + total2);
            }
        }
        //Задание 2.4
        System.out.println("Задание 2.4");
        int friday = 5;
        System.out.println("Сегодня пятница " + friday + "...-е число. Необходимо подготовить отчет.");
        for (int n = 7; n <= 31; n++) {
            if (n % 7 == 5) {
                friday = friday + 7;
                System.out.println("Сегодня пятница " + friday + "...-е число. Необходимо подготовить отчет.");
            }
        }
        //Задание 3.1
        System.out.println("Задание 3.1");
       int year = 0;
       int yearComet = 0;
       for ( int n = 0; n < (2021 +100 );n = n + 79) {
           if (n % 79 == 0) {
               yearComet = year + n;
               if (n > (2021 - 200))

               System.out.println(+yearComet);
           }
       }


          //Задание 3.2
        System.out.println("Задание 3.2");
       int n1 = 1;
       int p = 2;
       int p1 = 0;
       for ( n1 = 1; n1 <= 10; n1++) {
           p1 = p * n1;
           System.out.println(+ p + " * " + n1 + " = " +p1);

       }

    }
}
