//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет,то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " лет,то он не достиг совершеннолетия,нужно подождать");
        }

        System.out.println("Задание 2");
        int airTemperature = 6;
        if (airTemperature <= 5) {
            System.out.println("На улице холодно,нужно надеть шапку");
        }
        if (airTemperature > 5) {
            System.out.println("Сегодня тепло,можно идти без шапки");
        }

        System.out.println("Задание 3");
        int speed = 75;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч,то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч,то придется заплатить штраф");
        }

        System.out.println("Задание 4");

        int humanAge = 46;
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
        int occupiedPlaces = 101;
        System.out.println("Занято мест " + occupiedPlaces);
        int allPlases = 102;
        System.out.println("Вагон расситан на " + allPlases + " мест");
        int sittingPlaces = 60;
        System.out.println("Сидячих мест в вагоне рассчитано на " + sittingPlaces + " человек");
        int standingPlaces = allPlases - sittingPlaces;
        System.out.println("Стоячих мест в вагоне рассчитано на " + standingPlaces + " человека");
        if (occupiedPlaces <= 60) {
            System.out.println("В вагоне осталось свободных сидячих мест " + (sittingPlaces - occupiedPlaces) + " и " + standingPlaces + " свободных стоячих мест");
        }
        if (occupiedPlaces > 60 && occupiedPlaces< 102) {
            System.out.println("В вагоне осталось свободных сидячих мест " + (sittingPlaces - 60) + " и " + (standingPlaces - (occupiedPlaces - 60) + " свободных стоячих мест"));
        } else {
            System.out.println("Вагон полностью забит");
        }

    }
}
