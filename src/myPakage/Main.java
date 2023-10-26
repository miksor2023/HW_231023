package myPakage;

public class Main {
    public static void main (String[] args) {

        Griffindor harry = new Griffindor("Гарри Поттер", 9, 20, 33, 75, 12);
        Griffindor germiona = new Griffindor("Гермиона Грейнджер", 8, 55, 67, 39, 58);
        Griffindor ron = new Griffindor("Рон Уизли", 5, 24, 90, 62, 78);
        Slytherin draco = new Slytherin("Драко Малфой", 2, 15, 54, 12, 34, 24, 45);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 6, 13, 98, 32, 8, 84, 33);
        Slytherin gregory = new Slytherin("Грегори Гойл", 1, 24, 23, 11, 88, 26, 46);
        Hufflepuff zaharia = new Hufflepuff("Захария Смит", 2, 11, 34, 55, 36);
        Hufflepuff cedrik = new Hufflepuff("Седрик Диггори", 6, 17, 77, 39, 75);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 2, 11, 87, 86, 32);
        Ravenclaw chjou = new Ravenclaw("Чжоу Чанг", 7, 22, 12, 98, 43, 65);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 6, 2, 12, 98, 43, 65);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 3, 22, 10, 32, 87, 67);


        System.out.println("test");

        harry.printStudent();
        draco.printStudent();

        harry.compareWith(germiona);
        zaharia.compareWith(cedrik);
        padma.compareWith(marcus);
        graham.compareWith(gregory);

        harry.compareCommonPropretys(marcus);
        chjou.compareCommonPropretys(padma);
        cedrik.compareCommonPropretys(graham);
    }
}
