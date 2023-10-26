package myPakage;

public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgression;

    public Hogwarts(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void printStudent() {
        System.out.println("name: " + name + ", magic power: " + magicPower +
                ", transgression: " + transgression + this.toString());
    }
    public void compareCommonPropretys(Hogwarts student) {
        String magicScript = " обладает большей мощностью магии, чем ";
        String transScrint = " обладает большим расстоянием трансгрессии, чем ";
        System.out.println();
        if (this.magicPower > student.magicPower) {
            System.out.println(this.name + magicScript + student.name);
        } else if (student.magicPower > this.magicPower) {
            System.out.println(student.name + magicScript + this.name);
        } else {
            System.out.println("Ученики равны по силе магии");
        }
        if (this.transgression > student.transgression) {
            System.out.println(this.name + transScrint + student.name);
        } else if (student.transgression > this.transgression) {
            System.out.println(student.name + transScrint + this.name);
        } else {
            System.out.println("Ученики равны по дальности трансгрессии");
        }
    }
}