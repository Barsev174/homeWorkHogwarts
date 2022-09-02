public class Hogwarts {
    private String name;
    private int transgracing;
    private int magic;


    public Hogwarts() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTransgracing() {
        return transgracing;
    }

    public void setTransgracing(int transgracing) {
        this.transgracing = transgracing;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public Hogwarts(String name, int transgracing, int magic) {
        this.name = name;
        this.transgracing = transgracing;
        this.magic = magic;
    }

    public static void compareAnyStudentsAnfPrint(Hogwarts student1, Hogwarts student2) {
        int skillStudent1 = student1.getMagic() + student1.getTransgracing();
        int skillStudent2 = student2.getMagic() + student2.getTransgracing();
        if (skillStudent1 > skillStudent2) {
            System.out.println("Сила " + student1.getName() + " = " + skillStudent1 + ",  сила " + student2.getName() +
                    " = " + skillStudent2 + ". Значит " + student1.getName() + " сильнее, чем " + student2.getName());
        } else {
            System.out.println("Сила " + student2.getName() + " = " + skillStudent2 + ",  сила " + student1.getName() +
                    " = " + skillStudent1 + ". Значит " + student2.getName() + " сильнее, чем " + student1.getName());
        }
    }
}
