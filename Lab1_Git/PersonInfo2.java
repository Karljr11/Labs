public class PersonInfo2 {

    public static String firstName = "Karl";
    public static String lastName = "Dupuy";
    public static int studentNo = 3********;
    public static String description = "KD";

    public static void displayFr() {
        String out = SIConstants.GREETING_FR;
        out += "Yo " + firstName + " " + lastName +" dit que Messi est le GOAT" + '.';
        out += SIConstants.STUDENT_NUMBER_FR + studentNo + '.';
        out += SIConstants.DESCRIPTION_FR + description + '.';
        out += SIConstants.EOL;
        
        System.out.println(out);
    }

    
    public static void displayEn() {
        String out = SIConstants.GREETING_EN;
        out += " yo " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_EN + studentNo + '.';
        out += SIConstants.DESCRIPTION_EN + description + '.';
        out += SIConstants.EOL;
        
        System.out.println(out);
    }
}



