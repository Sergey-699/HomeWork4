//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int age = 12;
        System.out.println("Возраст человека " + age + " лет");
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет,то он не достиг совершеннолетия,нужно подождать");
        }

        System.out.println("Задание 2");
        int airTemperature = 6;
        System.out.println("Температура воздуха на улице " + airTemperature + " градусов");
        if (airTemperature <= 5) {
            System.out.println("На улице холодно,нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло,можно идти без шапки");
        }

        System.out.println("Задание 3");
        int speed = 75;
        System.out.println("Скорость транспортного средства " + speed + " км/ч");
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч,то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч,то придется заплатить штраф");
        }

        System.out.println("Задание 4");
        int humanAge = 46;
        System.out.println("Возраст человека " + humanAge + " лет/года");
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то ему нужно ходить в детский сад");
        }
        if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то ему нужно ходить в школу");
        }
        if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то ему нужно ходить в университет");
        }
        if (humanAge > 24) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то ему нужно ходить на работу");
        }

        System.out.println("Задание 5");
        int childAge = 12;
        System.out.println("Возраст ребенка " + childAge + " лет/года");
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " ,то ему нельзя кататься на аттракционе ");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " ,то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " ,то ему можно кататься на аттракционе без сопровождении взрослого");
        }

        System.out.println("Задание 6");
        int allPlases = 102;
        System.out.println("Вагон расситан на " + allPlases + " мест");
        int sittingPlaces = 60;
        System.out.println("Сидячих мест в вагоне рассчитано на " + sittingPlaces + " человек");
        int standingPlaces = allPlases - sittingPlaces;
        System.out.println("Стоячих мест в вагоне рассчитано на " + standingPlaces + " человека");
        int occupiedSeats = 23;
        System.out.println("Занятые сидячие места " + occupiedSeats);
        int occupiedStanding = 23;
        System.out.println("Занятые стоячие места " + occupiedStanding);
        int occupiedPlaces = occupiedSeats + occupiedStanding;
        System.out.println("Всего занято мест в вагоне " + occupiedPlaces);

        if (occupiedPlaces < allPlases) {
            if (occupiedSeats < sittingPlaces) {
                System.out.println("В вагоне есть сидячие места");
            } else if (occupiedStanding < standingPlaces) {
                System.out.println("В вагоне есть стоячие места");
            }
        }else {
            System.out.println("Вагон полностью забит");
        }

            System.out.println("Задание 7");
            int one = 15;
            System.out.println("Первое число " + one);
            int two = 8;
            System.out.println("Второе число " + two);
            int three = 98;
            System.out.println("Третье число " + three);
            int max;
            if (one >= two && one >= three) {
                max = one;
            } else if (two >= one && two >= three) {
                max = two;
            } else {
                max = three;
            }
            System.out.println("Большее число из известных " + max);

        }
    }
