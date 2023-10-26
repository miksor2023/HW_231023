package myPakage;

public class Ravenclaw extends Hogwarts {
    int intellect;
    int wisdom;
    int wittiness;
    int creativity;

    public Ravenclaw(String name, int magicPower, int transgression, int intellect, int wisdom, int wittiness, int creativity) {
        super(name, magicPower, transgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public int getCreativity() {
        return creativity;
    }
    @Override
    public String toString() {
        return  ", intellect = " + intellect +
                ", wisdom = " + wisdom +
                ", wittiness = " + wittiness +
                ", creativity = " + creativity;
    }
    public void compareWith(Ravenclaw student) {
        int sum1 = this.intellect + this.wisdom + this.wittiness + this.creativity;
        int sum2 = student.intellect + student.wisdom + student.wittiness + student.creativity;
        String bestScript = " лучший Когтевранец, чем ";
        if (sum1 > sum2) {
            System.out.println(this.getName() + bestScript + student.getName());
        } else if (sum2 > sum1) {
            System.out.println(student.getName() + bestScript + this.getName());
        } else {
            System.out.println("Суммы параметров студентов равны");
        }
    }
}
