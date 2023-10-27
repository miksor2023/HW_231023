package myPakage;

public class HufflepuffStudent extends HogwartsStudent{
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magicPower, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }


    @Override
    public String toString() {
        return  "name: " + this.getName() +
                ", magicPower: " + this.getMagicPower() +
                ", transgression: " + this.getTransgression() +
                ", diligence: " + diligence +
                ", loyalty: " + loyalty +
                ", honesty: " + honesty;
    }
    public void compareWith(HufflepuffStudent student) {
        int sum1 = this.diligence + this.loyalty + this.honesty;
        int sum2 = student.diligence + student.loyalty + student.honesty;
        String bestScript = " лучший Пуффендуй, чем ";
        if (sum1 > sum2) {
            System.out.println(this.getName() + bestScript + student.getName());
        } else if (sum2 > sum1) {
            System.out.println(student.getName() + bestScript + this.getName());
        } else {
            System.out.println("Суммы параметров студентов равны");
        }
    }
}

