package myPakage;

public class Slytherin extends Hogwarts{
    int slyness;
    int resoluteness;
    int resourcefulness;
    int arrogance;
    int imperiousness;

    public Slytherin(String name, int magicPower, int transgression, int slyness, int resoluteness, int resourcefulness, int arrogance, int imperiousness) {
        super(name, magicPower, transgression);
        this.slyness = slyness;
        this.resoluteness = resoluteness;
        this.resourcefulness = resourcefulness;
        this.arrogance = arrogance;
        this.imperiousness = imperiousness;
    }

    public int getSlyness() {
        return slyness;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getArrogance() {
        return arrogance;
    }

    public int getImperiousness() {
        return imperiousness;
    }

    @Override
    public String toString() {
        return  ", slyness = " + slyness +
                ", resoluteness = " + resoluteness +
                ", resourcefulness = " + resourcefulness +
                ", arrogance = " + arrogance +
                ", imperiousness = " + imperiousness;
    }
    public void compareWith(Slytherin student) {
        int sum1 = this.slyness + this.resoluteness + this.resourcefulness + this.arrogance + this.imperiousness;
        int sum2 = student.slyness + student.resoluteness + student.resourcefulness + student.arrogance + this.imperiousness;
        String bestScript = " лучший Слизеринец, чем ";
        if (sum1 > sum2) {
            System.out.println(this.getName() + bestScript + student.getName());
        } else if (sum2 > sum1) {
            System.out.println(student.getName() + bestScript + this.getName());
        } else {
            System.out.println("Суммы параметров студентов равны");
        }
    }
}
