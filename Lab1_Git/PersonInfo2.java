public class PersonInfo2 {

    public static String firstName = "Karlos";
    public static String lastName = "Dupuy";
    public static int studentNo = 3*******4;
    public static String description = "KDJr11";
    public static void displayFr() {
        String out = SIConstants.GREETING_FR;
        out += "Je m'appelle " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_FR + studentNo + '.';
        out += SIConstants.DESCRIPTION_FR + description + '.';
        out += SIConstants.EOL;
        
        System.out.println(out);
    }

    
    public static void displayEn() {
        String out = SIConstants.GREETING_EN;
        out += "My name is " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_EN + studentNo + '.';
        out += SIConstants.DESCRIPTION_EN + description + '.';
        out += SIConstants.EOL;
        
        System.out.println(out);
    }
}
