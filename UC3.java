public class UC3 {

    public static void main(String[] args) {

        String[] O = {
                "   ***     ",
                " **   **   ",
                "**     **  ",
                "**     **  ",
                "**     **  ",
                "**     **  ",
                "**     **  ",
                " **   **   ",
                "   ***     "
        };

        String[] P = {
                " ******    ",
                " **    **  ",
                " **     ** ",
                " **    **  ",
                " ******    ",
                " **        ",
                " **        ",
                " **        ",
                " **        "
        };

        String[] S = {
                "  *****    ",
                " **        ",
                " **        ",
                "  *****    ",
                "      **   ",
                "        ** ",
                "        ** ",
                " **    **  ",
                "  *****    "
        };

        for (int i = 0; i < 9; i++) {
            System.out.println(String.join("  ",
                    O[i],
                    O[i],
                    P[i],
                    S[i]));
        }
    }
}


