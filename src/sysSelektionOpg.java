public class sysSelektionOpg {
    public static void main(String[] args) {
        //fælles input for samtlige 6 delopgaver
        int x = 5;
        int y = 8;
        int z = 3;

        //Test case for A
        // Input: x = 5, y = 8 , z = 3
        // Forventet output: A == true

        // Programkode A
        boolean A = x <= 5 && z != y;


        // Testkode A
        if (A == true)
            System.out.println("A : PASS "); //HVIS SANDT A = TRUE
        else
            System.out.println("A : FAIL "); // HVIS SANDT A = FALSE

        // Programkode B
        boolean B = x == 5 || x == y && z == 3;

        // Testkode B
        if (B == true)
            System.out.println("B : PASS "); //HVIS B true = PASS
        else
            System.out.println("B : FAIL "); //HVIS B ikke true = FALLS

        //Program kode C
        boolean C = x / y > z / x;

        //Testkode C
        if (C == false)
            System.out.println("C : PASS "); //HVIS C false = PASS

        else
            System.out.println("C : FAIL "); //Hvis C true = PASS

        //Programkode D
        boolean D = ! ( x != y - z ) == false;

        //Testkode D
        if (D == false)
            System.out.println("D : PASS "); //HVIS D false = Pass
        else
            System.out.println("D : FALL "); //HVIS d true = fail

        //Programkode E
        boolean E = 2 * x != x || x == 0;

        //Testkode E
        if (E == true)
            System.out.println("E : PASS ");//Hvis E false = PASS
        else
            System.out.println("E : FAIL ");//Hvis E true = false

        //Programkode F
        boolean F = ! true || ! false;

        //Testkode F
        if (E == true)
            System.out.println("E : PASS ");// Sand eller falsk print: PASS
        else
            System.out.println("E : FAIL ");// Falsk eller falsk : FAIL


    }
}
