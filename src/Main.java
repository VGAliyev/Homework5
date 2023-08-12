public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 5");

        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Task 1");

        byte clientOS = 0; // 0 - iOS, 1 - Android

        if (clientOS == 0) {
            System.out.println("Установите версию для iOS по ссылке.\n");
        } else if (clientOS == 1){
            System.out.println("Установите версию для Android по ссылке.\n");
        } else {
            System.out.println("Неизвестная операционная система!");
        }
    }

    public static void task2() {
        System.out.println("Task 2");

        byte clientOS = 1; // 0 - iOS, 1 - Android
        short clientDeviceYear = 2015;

        short cDY = 2010;

        if (clientOS == 0 && cDY < clientDeviceYear) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке.\n");
        } else if (clientOS == 0 && cDY >= clientDeviceYear) {
            System.out.println("Установите версию для iOS по ссылке.\n");
        } else if (clientOS == 1 && cDY < clientDeviceYear) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке.\n");
        } else if (clientOS == 1 && cDY >= clientDeviceYear) {
            System.out.println("Установите версию для Android по ссылке.\n");
        } else {
            System.out.println("Неизвестная операционная система!");
        }
    }

    public static void task3() {
        System.out.println("Task 3");

        short year = 2023;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным.\n");
        } else {
            System.out.println(year + " год не является високосным.\n");
        }
    }

    public static void task4() {
        System.out.println("Task 4");

        int deliveryDistance = 95;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1.\n");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2.\n");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3.\n");
        } else {
            System.out.println("Доставки на расстояние " + deliveryDistance + " км нет.\n");
        }
    }

    public static void task5() {
        System.out.println("Task 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + "-й месяц принадлежит сезону - зима.\n");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит сезону - весна.\n");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит сезону - лето.\n");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит сезону - осень.\n");
                break;
            default:
                System.out.println(monthNumber + " - это неверный номер месяца (от 1 до 12 включительно).\n");
                break;
        }
    }
}