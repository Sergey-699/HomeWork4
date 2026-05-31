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
        if (airTemperature<=5){
            System.out.println("На улице холодно,нужно надеть шапку");
        }
        if (airTemperature >5){
            System.out.println("Сегодня тепло,можно идти без шапки");
        }

        System.out.println("Задание 3");
        int speed = 75;
        if(speed<=60){
            System.out.println("Если скорость " + speed + " км/ч,то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " км/ч,то придется заплатить штраф");
        }

    }
}
