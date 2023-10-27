package myPakage;

public class GriffindorStudent extends HogwartsStudent{
    private int nobility;
    private int honour;
    private int bravery;

    public GriffindorStudent(String name, int magicPower, int transgression, int nobility, int honour, int bravery) {
        super(name, magicPower, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return  "name: " + this.getName() +
                ", magicPower: " + this.getMagicPower() +
                ", transgression: " + this.getTransgression() +
                ", nobility: " + nobility +
                ", honour: " + honour +
                ", bravery: " + bravery;
    }

    public void compareWith(GriffindorStudent student) {
        int sum1 = this.getNobility() + this.getHonour() + this.getBravery();
        int sum2 = student.getNobility() + student.getHonour() + student.getBravery();
        String bestScript = " лучший Гриффиндорец, чем ";
        if (sum1 > sum2) {
            System.out.println(this.getName() + bestScript + student.getName());
        } else if (sum2 > sum1) {
            System.out.println(student.getName() + bestScript + this.getName());
        } else {
            System.out.println("Суммы параметров студентов равны");
        }
    }
}
