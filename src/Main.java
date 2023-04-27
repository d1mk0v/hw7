public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1() {
        System.out.println("Задача 1");
        int deposit = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + deposit;
            i = i + 1;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        int j = 10;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birth = 17; // на 1000 человек;
        int mortality = 8; // на 1000 человек;
        int totalBirth = (birth * population) / 1000;
        int totalMortality = (mortality * population) / 1000;
        int year = 0;
        while (year < 10) {
            year = year + 1;
            population = population + totalBirth - totalMortality;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deposite = 15000;
        float total = 0f;
        int i = 1;
        for (; total <= 12_000_000; i++) {
            total = total + (total * 7) / 100;
            total = total + deposite;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int deposite = 15000;
        float total = 0f;
        int i = 1;
        for (; total <= 12_000_000; i++) {
            total = total + (total * 7) / 100;
            total = total + deposite;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int deposite = 15000;
        float total = 0f;
        int i = 1;
        for (; i <= 108; i++) {
            total = total + (total * 7) / 100;
            total = total + deposite;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int year = 0;
        int start = 1823;
        int finish = 2123;
        for (; year <= finish; year = year + 1) {
            if (year >= start && year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}