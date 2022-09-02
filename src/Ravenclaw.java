public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public Ravenclaw(String name, int transgracing, int magic, int mind, int wisdom, int wit, int creativity) {
        super(name, transgracing, magic);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    public static void compareAndPrint (Ravenclaw student1, Ravenclaw student2) {
        if (student1.getMind() + student1.getWisdom() + student1.getWit() + student1.getCreativity()>
                student2.getMind() + student2.getWisdom() + student2.getWit() + student2.getCreativity()) {
            System.out.println(student1.getName() + " лучше Когтевранец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучше Когтевранец, чем " + student1.getName());
        }
    }
}
