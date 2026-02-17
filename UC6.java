public class UC6 {

    public static void main(String[] args) {

        String[] O = bO();
        String[] P = bP();
        String[] S = bS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "   "
                    + O[i] + "   "
                    + P[i] + "   "
                    + S[i]);
        }
    }

    public static String[] bO() {
        return new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        };
    }

    public static String[] bP() {
        return new String[]{
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
        };
    }

    public static String[] bS() {
        return new String[]{
                " *****",
                "**     ",
                "**     ",
                " *****",
                "      **",
                "       **",
                "       **",
                "**     **",
                " *****"
        };
    }
}
