import java.time.LocalDate;
public class Main {
    public static void checkCurrentYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void updateAppVersion(int clientOsType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            if (clientOsType == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS.");
            } else if (clientOsType == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else if (clientOsType == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android.");
            } else if (clientOsType == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else if (clientOsType != 0 && clientOsType != 1) {
                System.out.println("Ошибка: неверный тип операционной системы.");
            } else {
                System.out.println("Устройство не нуждается в обновлении.");
            }
        }
    }

    public static int deliveryDays(int deliveryDistance) {
        int deliveryDays;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 4;
        }
        if (deliveryDays < 4) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
        return deliveryDays;
    }


    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {

        System.out.println("Задача 1");

        int year = 2023;
        checkCurrentYear(year);

    }

    public static void task2() {

        System.out.println("Задача 2");

        int osType = 1;
        int clientDeviceYear = 2012;
        updateAppVersion(osType, clientDeviceYear);


    }

    public static void task3() {

        System.out.println("Задача 3");
        int deliveryDistance = 95;
        deliveryDays(deliveryDistance);
    }

}

