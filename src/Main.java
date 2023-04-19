public class Main {
    public static void checkCurrentYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void main(String[] args) {

        task1();
        task2();
        //task3();
        //task4();

    }


    public static void task1() {

        System.out.println("Задача 1");

        int year = 2023;
        checkCurrentYear(year);


    }

    public static void task2() {

        System.out.println("Задача 2");


    }
}