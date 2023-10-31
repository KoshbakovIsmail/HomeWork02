import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
    }

    public static void test1() {
        System.out.println("              Задания №1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Ответ: Вам " + age + "  Вы совершеннолетний ");
        } else {
            System.out.println("Ответ: Вам " + age + "  Вы не достигли совершеннолетия, нужно немного подождать ");
        }
    }

    public static void test2() {
        System.out.println("              Задания №2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько градусов на улице: ");
        int temperature = scanner.nextInt();

        if (temperature >= 5) {
            System.out.println("Ответ: Сегодня " + temperature + "° градуса тепло, можно идти без шапки");
        } else {
            System.out.println("Ответ: На улице " + temperature + "° градуса холодно, нужно надеть шапку");
        }
    }

    public static void test3() {
        System.out.println("              Задания №3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные скорости со спидометра: ");
        int speed = scanner.nextInt();

        if (speed >= 61) {
            System.out.println("Ответ: Ваша скорость: " + speed + " км/ч Вы превысили скорость, придется заплатить штраф");
        } else {
            System.out.println("Ответ: Ваша скорость: " + speed + "км/ч Вы не превышаете скорость, можно ехать дальше");
        }
    }

    public static void test4() {
        System.out.println("              Задания №4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();

        if (age >= 25) {
            System.out.println("Ответ: Вам " + age + " Вы можете ходить на работу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Ответ: Вам " + age + " Вы можете ходить в университет");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Ответ: Вам " + age + " Вы можете ходить в школу");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Ответ: Вам " + age + " Вы можете ходить в детский сад");
        } else {
            System.out.println("Ошибка ");
        }
    }

    public static void test5() {
        System.out.println("              Задания №5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возрост ребенка: ");
        int age = scanner.nextInt();

        if (age >= 15) {
            System.out.println("Ответ: Вам " + age + " Вы можете кататся без сопровождения ");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Ответ: Вам " + age + " Вы можете кататся только в сопровождении взрослого," +
                    " если взрослого нет то кататся нельзя");
        } else {
            System.out.println("Вам нельзя кататся, в Аттракцион можно только с 5 лет. ");
        }
    }

    public static void test6() {
        System.out.println("              Задания №6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер билета (Номер билета максимум трех значное чесло!): ");
        int numberPassengers = scanner.nextInt();

        if (numberPassengers >= 103) {
            System.out.println("Ответ: Мест нет, вагон полный дожитесь следушего вагона");
        } else if (numberPassengers >= 61 && numberPassengers <= 102) {
            System.out.println("Ответ: Места вагоне остались только стоячие ");
        } else if (numberPassengers >= 1 && numberPassengers <= 60) {
            System.out.println("Ответ: Места вагоне есть можете занять седячое место ");
        } else {
            System.out.println("Ваш билет не распознон");
        }

    }

    public static void test7() {
        System.out.println("              Задания №7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("          Введите три целочесленных чесла на угат для определения какая самая большая чесло!");
        System.out.println("Ведите первое чесло: ");
        long numberOne = scanner.nextLong();
        System.out.println("Введите второе чесло: ");
        long numberTwo = scanner.nextLong();
        System.out.println("Введите третье чесло: ");
        long numberThree = scanner.nextLong();

        if (numberOne >= numberTwo && numberOne >= numberThree) {
            System.out.println("Ответ: Самая большая чело из трех данных: Первое чесло - " + numberOne);
        } else if (numberTwo >= numberOne && numberTwo >= numberThree) {
            System.out.println("Ответ: Самая большая чело из трех данных: Второе чесло - " + numberTwo);
        } else if (numberThree >= numberOne && numberThree >= numberTwo) {
            System.out.println("Ответ: Самая большая чело из трех данных: Третье чесло - " + numberThree);
        }
    }

}
