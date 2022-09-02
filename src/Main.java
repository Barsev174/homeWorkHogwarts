public class Main {
    public static void main(String[] args) {
        Griffindor garryPoter = new Griffindor("Гарри Поттер", 7, 8, 9, 8, 8);
        Griffindor germionaGranger = new Griffindor("Гермиона Грейнджер", 5, 9, 5, 7, 8);
        Griffindor ronWeezly = new Griffindor("Рон Уизли", 7, 5, 5, 8, 7);

        Slytherin drakoMalfloy = new Slytherin("Драко Малфой", 9, 5, 7, 6, 7, 9, 4);
        Slytherin grehemMontegu = new Slytherin("Грэхэм Монтегю", 5, 8, 3, 8, 6, 4, 9);
        Slytherin gregoryGoil = new Slytherin("Грегори Гойл", 5, 3, 9, 7, 5, 3, 8);

        Hufflepuff zahariaSmit = new Hufflepuff("Захария Смит", 6, 5, 3, 9, 7);
        Hufflepuff sedrikDiggory = new Hufflepuff("Седрик Диггори", 5, 9, 7, 6, 8);
        Hufflepuff jastinFinch = new Hufflepuff("Джастин Финч-Флетчли", 4, 6, 7, 5, 7);

        Ravenclaw chjoChang = new Ravenclaw("Чжоу Чанг", 5, 9, 4, 8, 6, 3);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 9, 6, 5, 5, 2, 7);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 4, 3, 7, 6, 7, 9);

        Griffindor[] studentGriffindor = {garryPoter, germionaGranger, ronWeezly};
        Hufflepuff[] studentHufflepuff = {zahariaSmit, sedrikDiggory, jastinFinch};
        Slytherin[] studentSlytherin = {drakoMalfloy, grehemMontegu, gregoryGoil};
        Ravenclaw[] studentRavenclaw = {chjoChang,padmaPatil,marcusBelby};

        PrintFaculty printFaculty = new PrintFaculty();

        printFaculty.print(studentRavenclaw);
        printFaculty.print(studentGriffindor);
        printFaculty.print(studentSlytherin);
        printFaculty.print(studentHufflepuff);

        Slytherin.compareAndPrint(drakoMalfloy, grehemMontegu);
        Griffindor.compareAndPrint(germionaGranger, garryPoter);
        Ravenclaw.compareAndPrint(padmaPatil,marcusBelby);
        Hufflepuff.compareAndPrint(sedrikDiggory,zahariaSmit);
        Hogwarts.compareAnyStudentsAnfPrint(garryPoter, drakoMalfloy);

    }


}