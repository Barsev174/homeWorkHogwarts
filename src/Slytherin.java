public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin() {

    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public Slytherin(String name, int transgracing, int magic, int cunning, int determination, int getAmbition, int resourcefulness, int lustForPower) {
        super(name, transgracing, magic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = getAmbition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public static void compareAndPrint(Slytherin student1, Slytherin student2) {
        if (student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getLustForPower() >
                student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getLustForPower()) {
            System.out.println(student1.getName() + " лучше Слизеринец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучше Слизеринец, чем " + student1.getName());
        }
    }


}
