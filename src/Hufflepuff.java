public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public Hufflepuff(String name, int transgracing, int magic, int diligence, int loyalty, int honesty) {
        super(name, transgracing, magic);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public static void compareAndPrint(Hufflepuff student1, Hufflepuff student2) {
        if (student1.getDiligence() + student1.getLoyalty() + student1.getHonesty() >
                student2.getDiligence() + student2.getLoyalty() + student2.getHonesty()) {
            System.out.println(student1.getName() + " лучше Пуфендуец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучше Пуфендуец, чем " + student1.getName());
        }
    }
}
