package myPakage;

public class Main {
    public static void main (String[] args) {

        GriffindorStudent harry = new GriffindorStudent("Гарри Поттер", 9, 20, 33, 75, 12);
        GriffindorStudent germiona = new GriffindorStudent("Гермиона Грейнджер", 8, 55, 67, 39, 58);
        GriffindorStudent ron = new GriffindorStudent("Рон Уизли", 5, 24, 90, 62, 78);
        SlytherinStudent draco = new SlytherinStudent("Драко Малфой", 2, 15, 54, 12, 34, 24, 45);
        SlytherinStudent graham = new SlytherinStudent("Грэхэм Монтегю", 6, 13, 98, 32, 8, 84, 33);
        SlytherinStudent gregory = new SlytherinStudent("Грегори Гойл", 1, 24, 23, 11, 88, 26, 46);
        HufflepuffStudent zaharia = new HufflepuffStudent("Захария Смит", 2, 11, 34, 55, 36);
        HufflepuffStudent cedrik = new HufflepuffStudent("Седрик Диггори", 6, 17, 77, 39, 75);
        HufflepuffStudent justin = new HufflepuffStudent("Джастин Финч-Флетчли", 2, 11, 87, 86, 32);
        RavenclawStudent chjou = new RavenclawStudent("Чжоу Чанг", 7, 22, 12, 98, 43, 65);
        RavenclawStudent padma = new RavenclawStudent("Падма Патил", 6, 2, 12, 98, 43, 65);
        RavenclawStudent marcus = new RavenclawStudent("Маркус Белби", 3, 22, 10, 32, 87, 67);


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
