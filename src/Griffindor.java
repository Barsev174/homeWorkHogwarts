public class Griffindor extends Hogwarts{

    private int nobility;
    private int honor;
    private int bravery;

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public Griffindor(String name, int transgracing, int magic, int nobility, int honor, int bravery) {
        super(name, transgracing, magic);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public static void compareAndPrint (Griffindor student1, Griffindor student2) {
        if (student1.getNobility() + student1.getHonor() + student1.getBravery()  >
                student2.getNobility() + student2.getHonor() + student2.getBravery() ) {
            System.out.println(student1.getName() + " лучше Грифендорец, чем " + student2.getName());
        }else {
            System.out.println(student2.getName() + " лучше Грифендорец, чем " + student1.getName());
        }
    }

}
