public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1.4
        //Задание №1
        System.out.println("");
        int i=0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("");
        for (;i > 0; i-- ) {
            System.out.print(i + " ");
        }

        System.out.println("");
        System.out.println("");

        //Задание №2
        int firstFriday = 6;
        for (;firstFriday <= 31;firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("");

        //Задание №3
        int yearBefore = 2022 - 200;
        int yearAfter = 2022 + 100;
        for (int y = 0;y < yearAfter;y = y + 79) {
            if (y > yearBefore) {
                System.out.println(y);
            }
        }
    }
}