package myPakage;

public abstract class HogwartsStudent {
    private String name;
    private int magicPower;
    private int transgression;

    public HogwartsStudent(String name, int magicPower, int transgression) {
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
        System.out.println(this.toString());
    }
    public void compareCommonPropretys(HogwartsStudent student) {
        String magicScript = " обладает большей мощностью магии, чем ";
        System.out.println();
        if (this.magicPower + this.transgression > student.magicPower + student.transgression) {
            System.out.println(this.name + magicScript + student.name);
        } else if (student.magicPower + student.transgression > this.magicPower + this.transgression) {
            System.out.println(student.name + magicScript + this.name);
        } else {
            System.out.println("Ученики равны по мощности магии");
        }
    }
}