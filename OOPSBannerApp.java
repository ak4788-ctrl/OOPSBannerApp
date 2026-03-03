public class OOPSBannerApp {

    // Function for O
    static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Function for P
    static String[] getP() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Function for S
    static String[] getS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O1 = getO();   // FIRST O
        String[] O2 = getO();   // SECOND O
        String[] P  = getP();
        String[] S  = getS();

        // Loop prints OOPS
        for (int i = 0; i < 7; i++) {
            System.out.println(
                    O1[i] + "  " +
                    O2[i] + "  " +
                    P[i]  + "  " +
                    S[i]
            );
        }
    }
}