public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        int clientAD = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientAD >= 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientAD = 0;
        int clientDeviceYear = 2015;
        if (clientOS >= 1 && clientDeviceYear >= 2015) {
            System.out.println("Если год выпуска телефона ранее " + clientDeviceYear + " и операционная система равна " + clientOS + " и " + clientAD + ", то установите облегченную версию приложения для iOS по ссылке и Android по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для пользователей телефонов " + clientDeviceYear +
                    " года выпуска и позже");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2020;
        if (year <= 2021) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20 || deliveryDistance <= 60 || deliveryDistance <= 100) {
            System.out.println("На доставку в пределах 20 км потребуется 1 день" + " ,на доставку в пределах 60 км потребуется 2 дня" +
                    " ,на доставку в пределах " + deliveryDistance + " км потребуется 3 дня" + ", свыше 100 км доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("январь принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("февраль принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("март принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("апрель принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("май принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("июнь принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("июль принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("август принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("сентябрь принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("октябрь принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("ноябрь принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("декабрь принадлежит к сезону зима");
            default:
                System.out.println("13 месяца не существует");
        }
    }
}
