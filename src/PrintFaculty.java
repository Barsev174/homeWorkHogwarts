public class PrintFaculty {
    public void print(Ravenclaw[] studentRavenclaw) {
        for (int i = 0; i < studentRavenclaw.length; i++) {
            Ravenclaw student = studentRavenclaw[i];
            System.out.println("Имя " + student.getName()
                    + "; Трангрессирование " + student.getTransgracing()
                    + "; Сила магии " + student.getMagic()
                    + "; Ум " + student.getMind()
                    + "; Мудрость " + student.getWisdom()
                    + "; Остроумие " + student.getWit()
                    + "; Творчество " + student.getCreativity());
        }
        System.out.println();
    }

    public void print(Griffindor[] studentGriffindor) {
        for (int i = 0; i < studentGriffindor.length; i++) {
            Griffindor student = studentGriffindor[i];
            System.out.println("Имя " + student.getName()
                    + "; Трангрессирование " + student.getTransgracing()
                    + "; Сила магии " + student.getMagic()
                    + "; Благородство " + student.getNobility()
                    + "; Честь " + student.getHonor()
                    + "; Храбрость " + student.getBravery());
        }
        System.out.println();
    }

    public void print(Slytherin[] studentSlytherin) {
        for (int i = 0; i < studentSlytherin.length; i++) {
            Slytherin student = studentSlytherin[i];
            System.out.println("Имя " + student.getName()
                    + "; Трангрессирование " + student.getTransgracing()
                    + "; Сила магии " + student.getMagic()
                    + "; Решительность " + student.getDetermination()
                    + "; Амбициозность " + student.getAmbition()
                    + "; Нахожчивость " + student.getResourcefulness()
                    + "; Жажда власти " + student.getLustForPower());
        }
        System.out.println();
    }

    public void print(Hufflepuff[] studentHufflepuff) {
        for (int i = 0; i < studentHufflepuff.length; i++) {
            Hufflepuff student = studentHufflepuff[i];
            System.out.println("Имя " + student.getName()
                    + "; Трангрессирование " + student.getTransgracing()
                    + "; Сила магии " + student.getMagic()
                    + "; Трудолюбие " + student.getDiligence()
                    + "; Верность " + student.getLoyalty()
                    + "; Честнось " + student.getHonesty());
        }
        System.out.println();

    }
}
