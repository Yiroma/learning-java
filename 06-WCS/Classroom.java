public class Classroom {
    public static void main(String[] args) {

        // create instances of Wilder
        Wilder[] wilders = {
                new Wilder("Jean-Claude", true),
                new Wilder("Henri", false)
        };

        // print the result of the whoAmI method for each wilder
        for (Wilder wilder : wilders) {
            System.out.println(wilder.whoAmI());
        }
    }
}
